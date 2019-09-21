package com.rifkiansyah.authservice.Repository;

import com.rifkiansyah.authservice.Domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository {
    Optional<User> findByUsername(String username);
}
