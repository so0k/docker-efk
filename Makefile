DOCKER_REGISTRY ?= docker.io/
SHORT_NAME=logviz
BUILD_TAG ?= git-$(shell git rev-parse --short HEAD)
IMAGE_PREFIX ?= vincentdesmet

include versioning.mk

PAUSE_IMAGE ?= gcr.io/google_containers/pause-amd64:3.0

build: docker-build
up: docker-up
down: docker-down
reload: docker-reload
init: docker-init
logs: docker-logs
clean: docker-clean
puwh: docker-push
attach: docker-exec

get-pause:
	-mkdir -p bin/
	docker run -d ${PAUSE_IMAGE} 
	docker cp `docker ps -q -f ancestor=${PAUSE_IMAGE} -n=1`:/pause ./bin/pause
	docker stop `docker ps -q -f ancestor=${PAUSE_IMAGE} -n=1`
	docker rm `docker ps -q -f ancestor=${PAUSE_IMAGE} -n=1`

docker-init:
	docker-compose -p ${SHORT_NAME} run fluentd  dockerize -wait tcp://es:9200 -timeout 60s curl -sXPUT http://es:9200/_template/logstash --upload-file /usr/share/elasticsearch-template.json

docker-build: 
	@#docker build --rm=true --tag=${IMAGE} -f Dockerfile .
	@#docker tag ${IMAGE} ${MUTABLE_IMAGE}

docker-reload:
	docker-compose -p ${SHORT_NAME} kill -s SIGHUP fluentd

docker-logs:
	docker-compose -p ${SHORT_NAME} logs -f fluentd

docker-clean:
	docker volume rm ${SHORT_NAME}_esdata

docker-up:
	docker-compose -p ${SHORT_NAME} -f docker-compose.yaml up -d

docker-down:
	docker-compose -p ${SHORT_NAME} -f docker-compose.yaml down

docker-exec:
	docker exec -it awsdbr_parser_1 /bin/bash
