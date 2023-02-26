package com.cleverlance.academy.aggregator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;


@RestController
public class AggregatorController {

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> getIdentification() {
        
        return ResponseEntity.ok(new Identification("meteostanica", new Address("Dance", "2556", "Ricany"), new Person("Artem", "Minsadyrov")));
    }
}
