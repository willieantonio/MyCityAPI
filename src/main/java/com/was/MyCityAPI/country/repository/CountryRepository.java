package com.was.MyCityAPI.country.repository;

import com.was.MyCityAPI.country.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
