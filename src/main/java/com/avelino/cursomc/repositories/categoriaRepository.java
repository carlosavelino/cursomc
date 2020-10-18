package com.avelino.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avelino.cursomc.domain.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Integer> {

	
	
}
