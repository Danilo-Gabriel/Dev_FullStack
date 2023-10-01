package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // TAG PARA SPRING RECONHECER ESSA CLASSE;
@RequestMapping("medicos") //Mapeando a URL;
public class MedicoController {

    @Autowired //
    private MedicoRepository repository;
    @PostMapping // SE CHEGAR REQUISIÇÂO VIA POSTMAN É PARA CHAMAR ESSE METODO;
    @Transactional // ANOTAÇÃO PARA QUE TODAS AS TRANFERENCIAS PASSEM PARA TRANSAÇÃO (CASO SEJA SUCESSO ARMAZENA OS DADOS, CASO AO CONTRARIO CANCELA)
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){

        repository.save(new Medico(dados));

    }


    @GetMapping // PUXA OS DADOS essa url receber uma requisição do tiṕo get ele vai entender por conta da anotação
    public Page<DadosListagemMedico> medicoList(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){ //Anotação está passando 10 registros na paginação e ordanando por nome

        //FORMA ORDENADA
        return repository.findAll(paginacao).map(DadosListagemMedico::new); // Repository JPA já tem diversas blibiotes e temos uma classe repository extedendo dela
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){

        var medico = repository.getReferenceById(dados.id());

        medico.atualizarInformacao(dados);
    }



}
