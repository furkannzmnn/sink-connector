curl -X POST http://localhost:8083/connectors -H 'Content-Type: application/json' -d \
'{
   "name": "elastic-sink",
   "config": {
     "connector.class": "io.confluent.connect.elasticsearch.ElasticsearchSinkConnector",
     "tasks.max": "1",
     "topics": "metro_search.metro.dbo.product",
     "schema.ignore": "true",
     "connection.url": "http://elastic:9200",
     "type.name": "_doc",
     "name": "elastic-sink",
     "value.converter": "org.apache.kafka.connect.json.JsonConverter",
     "key.converter": "org.apache.kafka.connect.storage.StringConverter",
     "behavior.on.null.values": "delete"
   }
 }'
