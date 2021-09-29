package com.microservices.produccataloc.controller;

import com.microservices.produccataloc.model.Product;
import com.microservices.produccataloc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*
* RestController = "Pai" dos serviços Rest
* RequestMapping -> rota dos serviços ,
* Optional  -> evita buscas Null
* */

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)  // METODO PARA CRIAR
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)        //METODO PARA BUSCA DE PRODUTOS POR ID
    public Product findById(@PathVariable Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

   @RequestMapping(value = "/{id}", method = RequestMethod.DELET)
    public Product deletById(@PathVariable Long id){
        Optional<Product> product = productRepository.deletById(id);
        return product.delet();
    }


}
