package com.metro.metrosearchapp.api;

import com.metro.metrosearchapp.model.elastic.Product;
import com.metro.metrosearchapp.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchApi {
    private final RestClient client;

    @GetMapping
    public void search() throws IOException {

        Request request = new Request("GET", "/_search");
        // find all products
        request.setJsonEntity("{\n" +
                "  \"query\": {\n" +
                "    \"match_all\": {}\n" +
                "  }\n" +
                "}");

        Response response = client.performRequest(request);

        Product product = new Product();
        int read = response.getEntity().getContent().read();
        while (read != -1) {
            System.out.print((char) read);
            read = response.getEntity().getContent().read();
        }
    }
}
