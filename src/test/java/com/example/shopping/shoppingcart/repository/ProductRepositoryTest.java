package com.example.shopping.shoppingcart.repository;

import com.example.shopping.shoppingcart.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindingProductById_thenCorrect() {
        Product product = new Product("orange", 30,1);
        productRepository.save(product);
        Optional<Product> byId = productRepository.findById(1);
        Assert.assertEquals(byId.get().getName(),"orange");

    }

}