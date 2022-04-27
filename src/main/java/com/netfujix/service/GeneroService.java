package com.netfujix.service;

import com.netfujix.model.Genero;
import com.netfujix.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;
    Integer id = null;

    public Genero salvar (Genero genero){
       return  repository.save(genero);
    }

    public Genero atualizar (Genero genero) throws Exception {
        if(genero.getId() == null){
            throw new Exception("ID Não encontrado");
        }
        return repository.save(genero);
    }

    public void deletar (int id){
        repository.deleteById(id);
    }

    public List<Genero> listarTodos (){
        return repository.findAll();
    }

}
