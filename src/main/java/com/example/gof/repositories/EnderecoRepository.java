package com.example.gof.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.gof.entities.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String>  {

}
