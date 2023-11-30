package com.nascimento.crudspring.Model;

import org.hibernate.annotations.CollectionId;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;




@Data
@Entity
@Table(name = "cursos")
public class Curso {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  @JsonProperty("_id") // estudar sobre: a principio para não criar DTO os para mudar nomes
  private Long id;


  //@Column(name = "nome") Nome da coluna diferente do atributo
  @Column(length = 200, nullable = false)
  private String nome;

  @Column(length = 10, nullable = false)
  private String categoria;




}
