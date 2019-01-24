package com.example.shopping.shoppingcart.rest;

import com.example.shopping.shoppingcart.pojo.Product;
import com.example.shopping.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/cart")
public class ProductController {

    @Autowired
    private ProductService cartService;

    @RequestMapping(method = POST,path = "/product", consumes = "application/json")
    public void addProducts(@RequestBody List<Product> products){
        cartService.addProducts(products);
    }


    @RequestMapping(method = GET,path = "/product", consumes = "application/json")
    public List<Product> getAllProduct(){
        return cartService.getAllProductById();
    }

    @RequestMapping(method = GET,path = "/product/{id}", consumes = "application/json")
    public Product getProduct(@PathVariable("id") String id){
        return cartService.getProductById(id);
    }

}
