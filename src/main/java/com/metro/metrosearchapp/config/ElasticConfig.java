package com.metro.metrosearchapp.config;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.RestClients;
import org.springframework.data.elasticsearch.support.HttpHeaders;

@Configuration
public class ElasticConfig {

    @Bean
    public RestClient client() {
        RestClient restClient = RestClient
                .builder(new HttpHost("localhost", 9200, "http"))
                .setDefaultHeaders(new Header[]{
                        new BasicHeader("Content-type", "application/json")
                })
                .build();

        return restClient;
    }

}
