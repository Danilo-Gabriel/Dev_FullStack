package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
import org.springframework.web.bind.annotation.RestController;


public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
