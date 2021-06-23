package com.stackroute.MongoDBInSpringBoot.seeddata;


import com.stackroute.MongoDBInSpringBoot.model.User;
import com.stackroute.MongoDBInSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData1 implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public SeedData1(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void run(String... args) throws Exception {
        userService.saveUser(new User(1,"Tharun","Male",21));
        userService.saveUser(new User(2,"Niki","Female",22));
        userService.saveUser(new User(3,"Nancy","Female",21));
        userService.saveUser(new User(4,"Laya","Female",22));

    }
}
