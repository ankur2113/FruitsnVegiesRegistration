package com.reset.FruitsnVegiesRegistration.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.reset.FruitsnVegiesRegistration.api.model.FruitsAndVegies;
import com.reset.FruitsnVegiesRegistration.api.repository.FNVRepository;

@RestController
public class FNVController {
	
	
	@Autowired
	private FNVRepository fnvrepository;
	
	@PostMapping("/savefruitorvegetable")
	public String savefruitorvegetableinfo(@RequestBody FruitsAndVegies fruitsnvegies) {
		fnvrepository.save(fruitsnvegies);
		return "Fruit or Vegetable added with ID: "+fruitsnvegies.getFruitsnvegiesid();
		}
	
	@GetMapping("/getallfruitsorvegetables")
	public List<FruitsAndVegies> getallfruitsandvegetables(){
		return fnvrepository.findAll();
	}
	
	
	@GetMapping("/getallfruitsorvegetablesbyid/{fruitsnvegiesid}")
	public Optional<FruitsAndVegies> getfarmer(@PathVariable int fruitsnvegiesid){
		return fnvrepository.findById(fruitsnvegiesid);
	}
	
	@DeleteMapping("/deletefarmerbyid/{fruitsnvegiesid}")
	public String deletefarmer(@PathVariable int fruitsnvegiesid) {
		fnvrepository.deleteById(fruitsnvegiesid);
		return "Fruit or Vegetable with ID: "+fruitsnvegiesid+ " was deleted";
	}
	
	
}
