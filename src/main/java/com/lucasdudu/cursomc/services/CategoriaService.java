package com.lucasdudu.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdudu.cursomc.domain.Categoria;
import com.lucasdudu.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//instanciar o repositorio
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		return obj;
	}

}
