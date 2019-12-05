package com.lucasdudu.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdudu.cursomc.domain.Categoria;
import com.lucasdudu.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	//Path... indica que o id que vem do request.. é o que vai de argumento pro método
	
	//responseEntity - Requisição web
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		Categoria obj = service.buscar(id);		
		return ResponseEntity.ok().body(obj);		
	}
}
