package com.example.demo.cardOwner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardOwnerRepository extends JpaRepository<CardOwner, String> {

}
