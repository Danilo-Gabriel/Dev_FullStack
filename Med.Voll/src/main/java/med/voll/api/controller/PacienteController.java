package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.Paciente.DadosCadastroPaciente;
import med.voll.api.Paciente.DadosListagemPaciente;
import med.voll.api.Paciente.Paciente;
import med.voll.api.Paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){

      repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> pacienteList(@PageableDefault(size = 10, sort = {"nome"})Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

    /*
    FORMA TRADICIONAL SEM PAGINAÇÂO E ORDENAÇÂO
       public List<DadosListagemPaciente> pacienteList(){
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }
     */

}
