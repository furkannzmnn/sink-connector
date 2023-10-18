curl -i -X POST -H "Accept:application/json" \
    -H  "Content-Type:application/json" http://localhost:8083/connectors/ \
    -d '{
          "name": "sqlserver-connector",
          "config": {
            "connector.class": "io.debezium.connector.sqlserver.SqlServerConnector",
            "tasks.max": "1",
            "database.hostname": "sqlserver",
            "topic.prefix": "metro_search",
            "topic.creation.default.replication.factor": "1",
            "database.port": "1433",
            "database.user": "sa",
            "database.password": "Password123",
            "database.server.id": "184055",
            "database.dbname": "metro",
            "database.server.name": "127.0.0.1",
            "database.include": "product",
            "database.names": "metro",
            "database.history.kafka.bootstrap.servers": "kafka:9092",
            "schema.history.internal.kafka.bootstrap.servers": "kafka:9092",
            "database.history.kafka.topic": "metro_search",
            "schema.history.internal.kafka.topic": "metro_search",
            "transforms": "route",
            "transforms.route.type": "org.apache.kafka.connect.transforms.RegexRouter",
            "transforms.route.regex": "([^.]+)\\.([^.]+)\\.([^.]+)",
            "transforms.route.replacement": "$3",
            "database.encrypt": false,
            "topic.creation.default.partitions": "1"
             }
        }'