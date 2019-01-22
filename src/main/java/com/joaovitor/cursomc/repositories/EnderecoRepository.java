package com.joaovitor.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaovitor.cursomc.domain.Endereco;

//Repository é capaz de realizar operações de acesso a dados, busca, alterar etc
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}

