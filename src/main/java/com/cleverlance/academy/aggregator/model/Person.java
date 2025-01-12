package com.cleverlance.academy.aggregator.model;


import lombok.Data;
import lombok.Value;

import javax.validation.constraints.Email;

@Value
public class Person {
    private String firstName;
    private String lastName;
    @Email
    private String email;

    private String gender;
}