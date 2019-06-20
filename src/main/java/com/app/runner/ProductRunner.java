package com.app.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("------1.Output-----------------------------------");
		Product p =repo.getData(4);
		System.out.println(p.getProdCode());  //This may thorw exception

		
		System.out.println("------2.Output-----------------------------------");
		Optional<Product> p1=repo.getInfo(2);
		if(p1. isPresent()) {

			Product prd =p1.get();
			System.out.println(prd.getProdCode());

		}else {
			System.out.println("NO DATA FOUND..");
		}

	}

}
