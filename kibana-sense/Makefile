DOCKER_REGISTRY ?= docker.io/
SHORT_NAME=kibana-sense
BUILD_TAG ?= git-$(shell git rev-parse --short HEAD)
IMAGE_PREFIX ?= vincentdesmet

include versioning.mk

build: docker-build
up: docker-up
down: docker-down
push: docker-push
logs: docker-logs

docker-build: 
	docker build --rm=true --tag=${IMAGE} -f Dockerfile .
	docker tag ${IMAGE} ${MUTABLE_IMAGE}

docker-up:
	docker-compose -p ${SHORT_NAME} -f docker-compose.yaml up -d

docker-down:
	docker-compose -p ${SHORT_NAME} -f docker-compose.yaml down

docker-logs:
	docker-compose -p ${SHORT_NAME} logs -f
