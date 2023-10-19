package com.metro.metrosearchapp.api;

import com.metro.metrosearchapp.model.elastic.Product;
import com.metro.metrosearchapp.repository.elastic.ElasticProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchApi {
    private final ElasticProductRepository elasticProductRepository;

    @GetMapping
    public void search() throws IOException {
        System.out.println("search");
        elasticProductRepository.findAllBoost();
        elasticProductRepository.findByBrandNameSearch("Brand");
    }
}
