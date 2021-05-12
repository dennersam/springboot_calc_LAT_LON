package com.dennermaps.citiesapi.countries.repository;

import com.dennermaps.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
