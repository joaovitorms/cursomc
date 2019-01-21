package com.joaovitor.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaovitor.cursomc.domain.Produto;

//Repository é capaz de realizar operações de acesso a dados, busca, alterar etc
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

