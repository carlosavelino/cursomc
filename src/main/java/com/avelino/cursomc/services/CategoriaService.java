package com.avelino.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avelino.cursomc.domain.Categoria;
import com.avelino.cursomc.repositories.categoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private categoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
}
