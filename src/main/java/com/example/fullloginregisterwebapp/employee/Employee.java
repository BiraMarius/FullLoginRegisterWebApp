package com.example.fullloginregisterwebapp.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String badgeNumber;

}
