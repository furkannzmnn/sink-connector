package com.metro.metrosearchapp.repository.elastic;

import com.metro.metrosearchapp.model.elastic.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ElasticProductRepository extends ElasticsearchRepository<Product, String> {
    @Query("{\"bool\": {\"must\": {\"match\": {\"after.brand_name\": \"?0\"}}, \"should\": [{\"match\": {\"after.is_itob\": true}}], \"boost\": \"2.0\"}}")
    List<Product> findByBrandNameSearch(String brandName);

    // findall ama is_itob değeri true olanlar boost edilerek getirilecek
    @Query("{\"bool\": {\"must\": {\"match_all\": {}}, \"should\": [{\"match\": {\"after.sort_order\": {\"query\": \"77\", \"boost\": 2.0}}}]}}")
    List<Product> findAllBoost();
}
