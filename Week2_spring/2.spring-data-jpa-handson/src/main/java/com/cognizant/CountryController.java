package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Country;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

    @GetMapping("/contains/{name}")
    public List<Country> contains(@PathVariable String name) {
        return service.getCountriesContaining(name);
    }

    @GetMapping("/starts/{name}")
    public List<Country> starts(@PathVariable String name) {
        return service.getCountriesStarting(name);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.save(country);
    }
}