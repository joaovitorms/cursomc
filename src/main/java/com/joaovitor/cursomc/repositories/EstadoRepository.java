package com.joaovitor.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaovitor.cursomc.domain.Estado;

//Repository é capaz de realizar operações de acesso a dados, busca, alterar etc
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}

