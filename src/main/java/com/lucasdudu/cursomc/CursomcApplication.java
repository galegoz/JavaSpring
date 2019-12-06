package com.lucasdudu.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucasdudu.cursomc.domain.Categoria;
import com.lucasdudu.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
//CommandLinner - serve para executar uma ação quando o comando rodar, ele gera o método
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");		
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.save(Arrays.asList(cat1,cat2));
		
	}

}
