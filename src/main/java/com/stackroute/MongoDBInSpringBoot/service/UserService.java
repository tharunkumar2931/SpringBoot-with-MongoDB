package com.stackroute.MongoDBInSpringBoot.service;

import com.stackroute.MongoDBInSpringBoot.model.User;

import java.util.List;

public interface UserService {
    User saveUser (User user);
    List<User> getAllUser();
    public void deleteUserById(int id) throws Exception;
    User updateUser(User user) throws Exception;
    User getUserById(int id) throws Exception;
  public User searchByAgeAndGender(String firstName);


}