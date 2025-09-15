package org.example;

import java.util.List;

public class ProductCategory {
    int categoryId;
    String categoryName;
    List<Product> productList;
    Double price;

    public ProductCategory(int categoryId, String categoryName, List<Product> productList, Double price) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.productList = productList;
        this.price = price;
    }

    public void addProduct(Product prod)
    {
        this.productList.add(prod);
    }
    public void removeProduct(Product prod)
    {
        this.productList.remove(prod);
    }
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
