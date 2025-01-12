package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.stereotype.Component;

@Component
public class IdentificationRepositoryImpl implements IdentificationRepository {

    @Override
    public Identification getIdentification() {
        return new Identification("Moje meteostanice", new Address("Hlavni", "12", "Praha"), new Person("Artem", "Lastname", "mail@seznam.cz", "MALE"));
    }
}
