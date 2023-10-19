package com.metro.metrosearchapp.service;

import com.metro.metrosearchapp.model.elastic.Product;
import com.metro.metrosearchapp.repository.ProductRepository;
import com.metro.metrosearchapp.repository.elastic.ElasticProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MigrationService {

    private final ProductRepository productRepository;
    private final ElasticProductRepository elasticProductRepository;

    @Transactional
    public void migrate() {
        log.info("Migration started");
        productRepository.findAll().forEach(product -> {
            log.info("Migrating product: {}", product);
          //  Product elasticProduct = Product.builder()
          //          .brand_id(product.getBrandId())
          //          .brand_name(product.getBrandName())
          //          .is_itkg(product.getIsItKG())
          //          .pack_type(product.getPackType())
          //          .fullmgbnumber(product.getFullArticleName())
          //          .quick_search_article_name(product.getQuickSearchArticleName())
          //          .full_article_name_search(product.getFullArticleNameSearch())
          //          .product_definition(product.getProductDefinition())
          //          .product_content(product.getProductContent())
          //          .brand_name_search(product.getBrandNameSearch())
          //          .product_content_type(product.getProductContentType())
          //          .clear_content(product.getClearContent())
          //          .clear_content_type(product.getClearContentType())
          //          .selling_tax(product.getSellingTax())
          //          .build();
          //  elasticProductRepository.save(elasticProduct);
        });
    }
}
