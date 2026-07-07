package com.cognizant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

    List<Country> findByNameContaining(String name);

    List<Country> findByNameStartingWith(String name);
}