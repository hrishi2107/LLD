package org.example;
import java.util.ArrayList;
import java.util.List;
public class Inventory {
    List<ProductCategory> productCategoryList;

    public Inventory() {
        this.productCategoryList = new ArrayList<>();
    }
    public void addProductCategory(ProductCategory productCategory)
    {
        this.productCategoryList.add(productCategory);
    }
    public void removeProductCategory(ProductCategory productCategory)
    {
        this.productCategoryList.remove(productCategory);
    }
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }
}
