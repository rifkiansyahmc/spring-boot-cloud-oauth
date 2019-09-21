package com.rifkiansyah.authservice.Config.MongoDB;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.rifkiansyah.authservice.Repository")
public class MongoConfig {

}