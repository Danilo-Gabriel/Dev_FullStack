package med.voll.api.controller;

import med.voll.api.Paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Pacientes")
public class PacienteController {

    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados);
    }
}
