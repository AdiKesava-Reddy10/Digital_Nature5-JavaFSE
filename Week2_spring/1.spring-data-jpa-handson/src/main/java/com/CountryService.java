package com.cognizant.service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country save(Country country) {
        return repository.save(country);
    }

    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }
}