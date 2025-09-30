package com.aruiz.data.repository;

import com.aruiz.data.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, String> {
    @Query("""
              select p from Person p
              join fetch p.ciudad c
              where p.telefono = :tel
            """)
    Optional<Person> findWithCityByTelefono(@Param("tel") String tel);
}
