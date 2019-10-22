package com.codeclan.example.forest_organiser.repositories;

import com.codeclan.example.forest_organiser.models.Forest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface ForestRepository extends JpaRepository<Forest, Long> {
}
