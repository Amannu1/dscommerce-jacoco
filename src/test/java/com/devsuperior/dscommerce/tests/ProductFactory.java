package com.devsuperior.dscommerce.tests;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

public class ProductFactory {

    public static Product createProduct(){
        Category category = CategoryFactory.createCategory();
        Product product = new Product(1L, "KMS", "Lorem ipsum", 399.9, "https");
        product.getCategories().add(category);
        return product;
    }

    public static Product createProduct(String name){
        Product product = createProduct();
        product.setName(name);
        return product;
    }
}
