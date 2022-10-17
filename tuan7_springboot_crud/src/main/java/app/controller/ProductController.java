package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Product;
import app.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductRepository reposi;
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		reposi.save(product);
		System.out.println(reposi.save(product));
		return reposi.save(product);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable String id) {
		reposi.deleteById(id);
		
	}
	@GetMapping("")
	public List<Product> getAll(){
		return reposi.findAll();
	}
}
