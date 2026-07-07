package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    // HQL
    public List<Country> getAllCountries() {
        return repository.getAllCountries();
    }

    // Native Query
    public List<Country> getAllCountriesNative() {
        return repository.getAllCountriesNative();
    }
}