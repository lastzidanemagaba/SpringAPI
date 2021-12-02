package com.domain.services;

import java.util.List;
import javax.transaction.Transactional;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo ProductRepo;

    public Product create(Product product){
        return ProductRepo.save(product);
    }

    public Product findOne(String kode){
        return ProductRepo.findById(kode).get();
    }

    public Iterable<Product> findAll(){
        return ProductRepo.findAll();
    }

   

    public List<Product> findByName(String name){
        return ProductRepo.findByNameContains(name);
    }

    public Product save(Product product) {
        return null;
    }
}
