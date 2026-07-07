package com.cognizant.controller;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getCountry(
            @PathVariable String code) {
        return service.getCountry(code);
    }

    @PostMapping
    public Country addCountry(
            @RequestBody Country country) {
        return service.save(country);
    }
}