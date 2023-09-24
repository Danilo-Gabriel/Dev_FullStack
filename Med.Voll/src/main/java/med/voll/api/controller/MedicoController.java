package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // TAG PARA SPRING RECONHECER ESSA CLASSE;
@RequestMapping("medicos") //Mapeando a URL;
public class MedicoController {

    @Autowired //
    private MedicoRepository repository;
    @PostMapping // SE CHEGAR REQUISIÇÂO VIA POSTMAN É PARA CHAMAR ESSE METODO;
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){

        repository.save(new Medico(dados));

    }



}
