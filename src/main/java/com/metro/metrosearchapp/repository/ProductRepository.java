package com.metro.metrosearchapp.repository;

import com.metro.metrosearchapp.model.elastic.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
}
