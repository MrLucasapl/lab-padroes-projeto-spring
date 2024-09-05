package com.lucaspereira.cliente.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lucaspereira.cliente.entidade.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}