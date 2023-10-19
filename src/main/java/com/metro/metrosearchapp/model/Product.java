package com.metro.metrosearchapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    private Integer brandId;
    private String brandName;
    private int isItKG;
    private String packType;
    private String fullArticleName;
    private String quickSearchArticleName;
    private String fullArticleNameSearch;
    private String productDefinition;
    private String productContent;
    private String productContentType;
    private String clearContent;
    private String clearContentType;
    private int sellingTax;
    private String productionPlace;
    private int MGBNumber;
    private int variantNumber;
    private int bundleNumber;
    private int subSystemNumber;
    private String productContentText;
    private String fullMGBNumber;
    private int categoryID;
    private String categoryName;
    private String categoryNameSearch;
    private String brandNameSearch;
    private int productHeight;
    private int productWidth;
    private int productDepth;
    private String productCode;
    private boolean isItOB;
    private int sortOrder;
}
