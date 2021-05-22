package com.was.MyCityAPI.country.resources;

import com.was.MyCityAPI.country.entities.Country;
import com.was.MyCityAPI.country.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CountryResource {
    //Criandoo construtor.
    private final CountryRepository repository;

    public  CountryResource(final CountryRepository repository){
        this.repository = repository;
    }
    //Mapeando countries
    @GetMapping("/countries")
    public List<Country> city(){

        return repository.findAll();
    }
}
