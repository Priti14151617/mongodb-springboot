package com.priti.coding.mongodemo;


import com.priti.coding.mongodemo.category.Category;
import com.priti.coding.mongodemo.category.CategoryRepository;
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

	//@Bean
	public CommandLineRunner commandLineRunner(
			ProductRepository repository,
			CategoryRepository categoryRepository
	) {
		return args -> {
			var category = Category.builder()
					.name("cat 1")
					.description("cat desc 1")
					.build();

			var category2 = Category.builder()
					.name("cat 2")
					.description("cat  desc 2")
					.build();
			categoryRepository.insert(category);
			categoryRepository.insert(category2);
			var product = Product.builder()
					.name("iPhone")
					.description("Smart phone")
					.build();
			// repository.insert(product);
		};
	}
}

