package com.vcrts.rest.owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long>{

    @Query("SELECT o FROM Owner WHERE o.email = ?1")
    Optional<Owner> findOwnerByEmail(String email);
}
