package com.nascimento.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nascimento.crudspring.Model.Curso;
import com.nascimento.crudspring.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}


  //APENAS PARA TESTE, SERÁ INICIALIZADO JUNTAMENTO COM O PROJETO
  @Bean
  CommandLineRunner initDatabase(CursoRepository cursoRepository){

    return args -> {
      cursoRepository.deleteAll();

      Curso c = new Curso();

      c.setId(null);
      c.setNome("Angular com Spring");
      c.setCategoria("Front-end");

      cursoRepository.save(c);
    };

    

  }

}
