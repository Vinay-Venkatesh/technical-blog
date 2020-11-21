package com.blog.technical_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.blog.controller","com.blog.service"})
public class TechnicalBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalBlogApplication.class, args);
	}

}
