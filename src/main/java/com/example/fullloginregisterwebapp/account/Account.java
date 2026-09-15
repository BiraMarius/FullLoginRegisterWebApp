package com.example.fullloginregisterwebapp.account;

import com.example.fullloginregisterwebapp.person.Person;
import com.example.fullloginregisterwebapp.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private Person person;

    private List<User> users;

}
