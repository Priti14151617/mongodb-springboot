package com.priti.coding.mongodemo;


import com.priti.coding.mongodemo.product.Product;
import com.priti.coding.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductRepository repository){

		return args -> {
        var product = Product.builder()
				.name("Phone")
				.description("Smart Phone")
				.build();
		repository.insert(product);
		};
	}
}

