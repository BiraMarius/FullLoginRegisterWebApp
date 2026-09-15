package com.example.fullloginregisterwebapp.util.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EmploymentLevel
{

    UNEMPLOYED("Unemployed", "1"),
    EMPLOYED("Employed", "2"),
    STUDENT("Student", "3");

    private String name;

    private String employmentStatusCode;

    }
