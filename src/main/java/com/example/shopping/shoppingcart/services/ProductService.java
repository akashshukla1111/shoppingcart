package com.example.shopping.shoppingcart.services;

import com.example.shopping.shoppingcart.mapper.Mapper;
import com.example.shopping.shoppingcart.pojo.Product;
import com.example.shopping.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProducts(List<Product> products) {
        List<com.example.shopping.shoppingcart.entity.Product> entities = Mapper.mapPojosToEntities(products);
        productRepository.saveAll(entities);
    }

    public Product getProductById(String id) {
        Optional<com.example.shopping.shoppingcart.entity.Product> byId = productRepository.findById(Integer.parseInt(id));
        return Mapper.entityToPojo(byId.get());

    }

    public List<Product> getAllProductById() {
        Iterable<com.example.shopping.shoppingcart.entity.Product> all = productRepository.findAll();
        List<com.example.shopping.shoppingcart.entity.Product> entities = StreamSupport.stream(all.spliterator(), false)
                .collect(Collectors.toList());
        return Mapper.mapEntitiesToPojos(entities);

    }

}
