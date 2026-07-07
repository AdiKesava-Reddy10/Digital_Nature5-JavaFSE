package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Country;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    // HQL API
    @GetMapping("/hql")
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }

    // Native Query API
    @GetMapping("/native")
    public List<Country> getAllCountriesNative() {
        return service.getAllCountriesNative();
    }
}