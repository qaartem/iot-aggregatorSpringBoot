package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;


class IdentificationMapperTest {
    private static final IdentificationMapper MAPPER = Mappers.getMapper(IdentificationMapper.class);

    @Test
    void toIdentification() {
        Identification identification = new com.cleverlance.academy.aggregator.model.Identification("Moje meteostanice", new Address("Hlavni", "12", "Praha"), new Person("Artem", "Lastname", "mail@seznam.cz", "MALE"));

        org.openapitools.model.Identification converted = MAPPER.toIdentification(identification);

        assertEquals("Moje meteostanice", converted.getName());
        assertEquals("Hlavni", converted.getAddress().getStreet());
        assertEquals("12", converted.getAddress().getStreetNumber());
        assertEquals("Praha", converted.getAddress().getCity());
        assertEquals("Artem", converted.getOwner().getFirstName());
        assertEquals("Lastname", converted.getOwner().getLastName());

    }
}