package com.dev.api;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableCaching
public class ApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	
	@Bean
	ApplicationRunner runner (ProductService productService){
		return args -> {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Id: 1: " + productService.getById(1L));
			System.out.println("Id: 2: " + productService.getById(2L));
			System.out.println("Id: 1: " + productService.getById(1L));
			System.out.println("Id: 1: " + productService.getById(1L));
			System.out.println("Id: 1: " + productService.getById(1L));

		};
		
	}

}

record Product (Long id, String name, String description) implements Serializable{
}




@Service
class ProductService{
	Map<Long, Product> products = new HashMap<>(){
		
		{
			put(1L, new Product(1L, "Notebook", "Notebook Pro"));
			put(2L, new Product(2L, "Notebook", "Notebook Pro"));
			put(3L, new Product(3L, "Notebook", "Notebook Pro"));
			put(4L, new Product(4L, "Notebook", "Notebook Pro"));
			put(5L, new Product(5L, "Notebook", "Notebook Pro"));


		}

	};

	@Cacheable("products")
	Product getById(Long id){
		System.out.println("Buscando produtos..");
		simulateLatency();
		return products.get(id);
	}

	private void simulateLatency(){
		try {
			long time = 1000L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
}