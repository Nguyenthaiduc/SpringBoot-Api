package com.tutorial.apidemo.Springboot.database;

import com.tutorial.apidemo.Springboot.models.Product;
import com.tutorial.apidemo.Springboot.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //mim method goi ngay khi ung dung chay
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("MacBook Pro 16",2020,2999.0,"");
                Product productB = new Product("Ipad Air M1",2020,999.0,"");
               logger.info("insert data : " + productRepository.save(productA));
                logger.info("insert data : " + productRepository.save(productB));
            }
        };
    }
}
