package com.example.modelbackend.data_access_object;

import com.example.modelbackend.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "state", path = "state")
public interface StateRepository extends JpaRepository<State, Long> {



}
