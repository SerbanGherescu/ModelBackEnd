package com.example.modelbackend.data_access_object;

import com.example.modelbackend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRepository extends JpaRepository<Country, Long> {



}
