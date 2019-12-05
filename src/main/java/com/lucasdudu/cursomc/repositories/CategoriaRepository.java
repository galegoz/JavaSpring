package com.lucasdudu.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasdudu.cursomc.domain.Categoria;

//Vai buscar elementos do tipo categoria com base no tipo do atributo identificados, que no caso é o ID.
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
//basta fazer isso que já é possivel fazer as operações no banco de dados. como buscar, salvar...
}
