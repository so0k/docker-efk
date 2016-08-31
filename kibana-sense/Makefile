DOCKER_REGISTRY ?= docker.io/
SHORT_NAME=kibana-sense
BUILD_TAG ?= git-$(shell git rev-parse --short HEAD)
IMAGE_PREFIX ?= vincentdesmet

include versioning.mk

build: docker-build
up: docker-up
down: docker-down
push: docker-push
attach: docker-exec

docker-build: 
	docker build --rm=true --tag=${IMAGE} -f Dockerfile .
	docker tag ${IMAGE} ${MUTABLE_IMAGE}

docker-up:
	docker-compose -p awsdbr -f docker-compose.yaml up -d

docker-down:
	docker-compose -p awsdbr -f docker-compose.yaml down

docker-exec:
	docker exec -it awsdbr_parser_1 /bin/bash
