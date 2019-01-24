package com.example.shopping.shoppingcart.mapper;

import com.example.shopping.shoppingcart.entity.Product;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.collections.CollectionUtils.isEmpty;

public class Mapper {

    private static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    public static Product pojoToEntityMapper(com.example.shopping.shoppingcart.pojo.Product pojoProduct) {
        return dozerBeanMapper.map(pojoProduct, Product.class);
    }

    public static com.example.shopping.shoppingcart.pojo.Product entityToPojo(Product product){
        return dozerBeanMapper.map(product, com.example.shopping.shoppingcart.pojo.Product.class);
    }

    public static List<com.example.shopping.shoppingcart.pojo.Product> mapEntitiesToPojos(List<Product> products) {
        List<com.example.shopping.shoppingcart.pojo.Product> ProductPojos = new ArrayList<>();
        if (!isEmpty(products)) {
            products.stream().forEach(product -> {
                ProductPojos.add(entityToPojo(product));
            });
        }
        return ProductPojos;
    }

    public static List<Product> mapPojosToEntities(List<com.example.shopping.shoppingcart.pojo.Product> products) {
        List<Product> entityProducts = new ArrayList<>();
        if (!isEmpty(products)) {
            products.stream().forEach(product -> {
                entityProducts.add(pojoToEntityMapper(product));
            });
        }
        return entityProducts;
    }

}
