package com.lucaspereira.endereco.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lucaspereira.endereco.entidade.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}