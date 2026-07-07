package com.cognizant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("FROM Country")
    List<Country> getAllCountries();

    @Query(value = "SELECT * FROM country", nativeQuery = true)
    List<Country> getAllCountriesNative();

}