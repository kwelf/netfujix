package com.netfujix.repository;

import java.util.List;
import java.util.Optional;

import com.netfujix.model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanoRepository extends JpaRepository<Plano, Integer> {
    Optional<Plano> findById(Integer id);

    @Query("select f from Usuario f where f.usuario.nome = :usuario")
    List<Plano> buscaByUsuario(@Param("usuario") String usuario);


}
