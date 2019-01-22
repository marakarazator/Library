package com.koddokariery.library.Rent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {

    Rent findById(Long id);

}
