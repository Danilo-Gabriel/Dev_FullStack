package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.Paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){

      repository.save(new Paciente());
    }

    @GetMapping
    public Page<DadosListagemPaciente> pacienteList(@PageableDefault(size = 10, sort = {"nome"})Pageable paginacao){

        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
        // return repository.findAll(paginacao).map(DadosListagemPaciente::new); // BUSCA TODOS OS PACINTES LISTADOS
    }

    /*
    FORMA TRADICIONAL SEM PAGINAÇÂO E ORDENAÇÂO
       public List<DadosListagemPaciente> pacienteList(){
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }
     */


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados){

        var paciente = repository.getReferenceById(dados.id());

        paciente.atualizarInformacao(dados);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }


}
