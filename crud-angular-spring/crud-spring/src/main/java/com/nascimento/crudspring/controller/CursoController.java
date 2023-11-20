package com.nascimento.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nascimento.crudspring.Model.Curso;
import com.nascimento.crudspring.repository.CursoRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cursos")
 public class CursoController {



  private final CursoRepository cursoRepository;

  /*public CursoController(CursoRepository cursoRepository){
    this.cursoRepository = cursoRepository;
  }
  */



  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public @ResponseBody List<Curso>List(){

    return cursoRepository.findAll();
  }

 }
