package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.service.IdentificationService;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.openapitools.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identification")
public class IdentificationController implements IdentificationApi {

    public IdentificationController(IdentificationService identificationService) {
        this.identificationService = identificationService;
    }

    private final IdentificationService identificationService;


    @GetMapping
    public ResponseEntity<Identification> getIdentification() {
        com.cleverlance.academy.aggregator.model.Identification identification = this.identificationService.getIdentification();
        return ResponseEntity.ok(
                new Identification()
                        .name("Moje meteostanice")
                        .owner(new Owner()
                                .firstName("Jan")
                                .lastName("Novak"))
                        .address(new Address()
                                .street("Ulica")
                                .streetNumber("123/1")
                                .city("Praha"))
        );
    }
}
