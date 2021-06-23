package com.stackroute.MongoDBInSpringBoot.repository;

import com.stackroute.MongoDBInSpringBoot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {


}
