DIR_NAME ?= $(notdir $(shell pwd))

DOCKER_REGISTRY ?= docker.io/
SHORT_NAME ?= ${DIR_NAME}
BUILD_TAG ?= git-$(shell git rev-parse --short HEAD)
IMAGE_PREFIX ?= vincentdesmet

include versioning.mk

build: docker-build
push: docker-push
expose: kube-expose
install: kube-install
uninstall: kube-delete
upgrade: kube-update
run: docker-run
stop: docker-stop
logs: docker-logs

test:
	$(info Available targets) $(MAKEFILE_LIST)
	@echo "No tests defined yet"

docker-build: 
	docker build --rm=true --tag=${IMAGE} .
	docker tag ${IMAGE} ${MUTABLE_IMAGE}

docker-logs:
	docker logs -f `docker ps -lqf ancestor=${MUTABLE_IMAGE}`
	
docker-run: 
	docker run -d --name ${DIR_NAME} ${MUTABLE_IMAGE}
	@#echo "Exposed Ports:"
	@#docker inspect --format='{{range $$p, $$conf := .NetworkSettings.Ports}} {{$$p}} -> {{(index $$conf 0).HostPort}} {{end}}' `docker ps -lq -n1`

docker-stop: 
	-docker stop ${DIR_NAME} 
	docker rm ${DIR_NAME}

kube-delete:
	@echo "Nothing to delete"
	#-kubectl delete -f manifests/${SHORT_NAME}-deployment.tmp.yaml

kube-install: update-manifests
	#kubectl create -f manifests/${SHORT_NAME}-deployment.tmp.yaml

kube-update: update-manifests
	#kubectl patch deployment ${SHORT_NAME} -p '{"spec":{"template":{"spec":{"containers":[{"name":"'"${SHORT_NAME}"'","image":"'"${IMAGE}"'"}]}}}}'

kube-expose:
	@echo "Nothing to expose"
	#kubectl create -f manifests/flora-service.yaml

update-manifests:
	@echo "No Kubernetes Manifestst yet"
	@#sed 's#\(image:\) .*#\1 $(IMAGE)#' manifests/${SHORT_NAME}-deployment.yaml > manifests/${SHORT_NAME}-deployment.tmp.yaml
