package com.metro.metrosearchapp.model.elastic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "metro_search.metro.dbo.product", createIndex = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    private String id;
    @Field(type = FieldType.Nested, includeInParent = true)
    private Source.After after;

    @Data
    public class Source {
        @Field(type = FieldType.Nested, includeInParent = true)
        private After after;

        @Data
        public class After {
            private Integer brand_id;
            private Integer bundle_number;
            private Integer categoryid;
            private Integer is_itkg;
            private Boolean is_itob;
            private Integer mgbnumber;
            private Integer product_depth;
            private Integer product_height;
            private Integer product_width;
            private Integer selling_tax;
            private Integer sort_order;
            private Integer sub_system_number;
            private Integer variant_number;
            private String brand_name;
            private String brand_name_search;
            private String category_name;
            private String category_name_search;
            private String clear_content;
            private String clear_content_type;
            private String full_article_name;
            private String full_article_name_search;
            private String fullmgbnumber;
            private String pack_type;
            private String product_code;
            private String product_content;
            private String product_content_text;
            private String product_content_type;
            private String product_definition;
            private String production_place;
            private String quick_search_article_name;

        }
    }
}
