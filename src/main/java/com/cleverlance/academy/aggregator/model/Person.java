package com.cleverlance.academy.aggregator.model;


import lombok.Data;
import lombok.Value;

@Value
@Data
public class Person {
    private String firstName;
    private String lastName;
}