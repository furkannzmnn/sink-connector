package com.metro.metrosearchapp.model.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "metro_search", createIndex = false)
public class Product {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String databaseName;

    @Field(type = FieldType.Nested)
    private Object[] attributes;

    @Field(type = FieldType.Text)
    private String server;

    @Field(type = FieldType.Text)
    private String database;

}
