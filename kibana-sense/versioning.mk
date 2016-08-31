MUTABLE_VERSION ?= latest
DEV_TAG ?= dev
VERSION ?= git-$(shell git rev-parse --short HEAD)

IMAGE := ${DOCKER_REGISTRY}${IMAGE_PREFIX}/${SHORT_NAME}:${VERSION}
DEV_IMAGE := ${DOCKER_REGISTRY}${IMAGE_PREFIX}/${SHORT_NAME}:${DEV_TAG}
MUTABLE_IMAGE := ${DOCKER_REGISTRY}${IMAGE_PREFIX}/${SHORT_NAME}:${MUTABLE_VERSION}

info:
	@echo "Build tag:      ${VERSION}"
	@echo "Registry:       ${DOCKER_REGISTRY}"
	@echo "Immutable tag:  ${IMAGE}"
	@echo "Mutable tag:    ${MUTABLE_IMAGE}"

.PHONY: docker-push
docker-push: docker-mutable-push docker-immutable-push

.PHONY: docker-immutable-push
docker-immutable-push:
	docker push ${IMAGE}

.PHONY: docker-mutable-push
docker-mutable-push:
	docker push ${MUTABLE_IMAGE}
