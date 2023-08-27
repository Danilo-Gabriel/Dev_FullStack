package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // TAG PARA SPRING RECONHECER ESSA CLASSE;

@RequestMapping("medicos") //Mapeando a URL;
public class MedicoController {

    @PostMapping // SE CHEGAR REQUISIÇÂO VIA POSTMAN É PARA CHAMAR ESSE METODO;
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }



}
