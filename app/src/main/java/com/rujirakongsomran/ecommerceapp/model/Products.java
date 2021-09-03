package com.rujirakongsomran.ecommerceapp.model;

public class Products {
    private Integer productId;
    private String productName;
    private String productSize;
    private String productPrice;
    private Integer imageUrl;

    public Products() {
    }

    public Products(Integer productId, String productName, String productSize, String productPrice, Integer imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
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

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
