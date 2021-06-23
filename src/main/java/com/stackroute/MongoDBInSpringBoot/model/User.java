package com.stackroute.MongoDBInSpringBoot.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collection="users")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String gender;
    private int age;


}
