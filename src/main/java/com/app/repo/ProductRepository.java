package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


	@Query("Select p from Product p where p.prodId =:id ")
	public Product getData(Integer id);              //This may throw exception
	
	@Query("Select p from Product p where p.prodId=:id")
	public Optional<Product> getInfo(Integer id);    //This avoid null pointer exception
}
