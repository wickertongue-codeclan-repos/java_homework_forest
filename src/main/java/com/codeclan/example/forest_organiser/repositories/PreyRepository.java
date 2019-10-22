package com.codeclan.example.forest_organiser.repositories;

import com.codeclan.example.forest_organiser.models.Prey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PreyRepository extends JpaRepository<Prey, Long> {
}
