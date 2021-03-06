package com.netfujix.repository;

import java.util.Optional;

import com.netfujix.model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanoRepository extends JpaRepository<Plano, Integer> {
    Optional<Plano> findById(Integer id);


}
