package com.nascimento.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nascimento.crudspring.Model.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{


}
