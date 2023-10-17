curl -X POST http://localhost:8083/connectors -H 'Content-Type: application/json' -d \
'{
   "name": "elastic-sink",
   "config": {
     "connector.class": "io.confluent.connect.elasticsearch.ElasticsearchSinkConnector",
     "tasks.max": "1",
     "topics": "metro_search",
     "schema.ignore": "true",
     "connection.url": "http://elastic:9200",
     "transforms": "unwrap,key",
     "transforms.unwrap.type": "io.debezium.transforms.ExtractNewRecordState",
     "transforms.unwrap.drop.tombstones": "false",
     "transforms.key.type": "org.apache.kafka.connect.transforms.ExtractField$Key",
     "transforms.key.field": "id",
     "key.ignore": "true",
     "type.name": "kafka-connect",
     "behavior.on.null.values": "delete",
     "value.converter": "org.apache.kafka.connect.json.JsonConverter",
     "value.converter.schemas.enable": "false"
   }
 }'
