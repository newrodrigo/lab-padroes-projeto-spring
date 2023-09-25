package com.example.gof.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.gof.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
