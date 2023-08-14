package com.reset.FruitsnVegiesRegistration.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reset.FruitsnVegiesRegistration.api.model.FruitsAndVegies;

public interface FNVRepository extends MongoRepository<FruitsAndVegies, Integer>{

}
