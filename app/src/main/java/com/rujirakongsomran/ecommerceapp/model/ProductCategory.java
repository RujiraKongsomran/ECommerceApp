package com.rujirakongsomran.ecommerceapp.model;

public class ProductCategory {
    private Integer productId;
    private String productName;

    public ProductCategory() {
    }

    public ProductCategory(Integer productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
