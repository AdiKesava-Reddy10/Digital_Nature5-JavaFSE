package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country getCountry(String code) {
        return repository.findByCode(code);
    }

    public List<Country> getCountriesContaining(String name) {
        return repository.findByNameContaining(name);
    }

    public List<Country> getCountriesStarting(String name) {
        return repository.findByNameStartingWith(name);
    }

    public Country save(Country country) {
        return repository.save(country);
    }
}