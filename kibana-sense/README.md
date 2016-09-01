# Kibana image with Sense plug-in pre-installed

Sense provides an intuitive interface to work with the Elasticsearch API.

## Building

```
make build
```

## Running

To use Kibana, Elasticsearch should be reachable. No target is provided to run Kibana by itself, instead a compose file is used to start multiple interconnected containers.

To start the containers:
```
make up
```

To monitor the startup process of *all* containers:

```
make logs
```

Once all systems are ready, open Kibana dashboard:

```
open http://localhost
```

## clean up

Take down the stack (but keep the data)

```
make down
```

Note: The volumes created by the docker-compose file can be deleted if no data needs to be saved:

```
docker volume rm kibanasense_esdata
```

