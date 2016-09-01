# Fluentd image

This image provides uses the Alpine based Fluentd image and installs the necessary plugins for the demo setup.

The provided Fluentd config opens port `24224` to listen for Fluentd log forwarders.

As part of the playground setup, Fluentd will emulate logstash while sending data to Elasticsearch. The Elasticsearch index template for logstash is baked into the image as well. This ensures `raw` versions of each log field remain available after Elasticsearch ingestion.

To understand more about Elasticsearch index templates and Geoip, please refer to the excellent Elasticsearch documentation.

## Building

```
make build
```

## Running

```
make run
```

monitoring the logs:

```
make logs
```

To send sample logs using `fluent-cat`:

```
make attach
#repeat multiple times to fill buffer and force flush...
fluent-cat docker.generator.123 < /src/json-file-sample.log
```

Todo:

- Add config necessary to split `"options"` field in `parsed.generator.*` stream
- Play more with fluentd-grok-plugin
