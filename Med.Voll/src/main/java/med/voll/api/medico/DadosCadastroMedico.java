package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
import org.springframework.web.bind.annotation.RestController;


public record DadosCadastroMedico(


        /*
        ANOTAÇÕES PARA VALIDATION DE DADOS ANTES QUE SEJAM PASSADAS PARA O A ENTIDADE JPA QUE PASSARA PARA O BANCO;
        */
       @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,
        @NotNull @Valid DadosEndereco endereco) {


}
