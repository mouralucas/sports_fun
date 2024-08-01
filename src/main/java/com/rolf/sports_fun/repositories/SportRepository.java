package com.rolf.sports_fun.repositories;

import com.rolf.sports_fun.entities.SportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@Repository
public interface SportRepository extends JpaRepository<SportEntity, Long> {
}
