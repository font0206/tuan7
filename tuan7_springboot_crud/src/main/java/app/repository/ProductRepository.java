package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	
}
