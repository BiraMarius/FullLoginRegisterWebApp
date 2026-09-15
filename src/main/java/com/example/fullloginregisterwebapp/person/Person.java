package com.example.fullloginregisterwebapp.person;

import com.example.fullloginregisterwebapp.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Persons")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private List<User> users;

}
