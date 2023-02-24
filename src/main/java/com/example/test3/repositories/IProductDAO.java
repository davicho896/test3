package com.example.test3.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.test3.models.ProductDTO;



@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}
