package com.example.shopping.shoppingcart.repository;

import com.example.shopping.shoppingcart.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
