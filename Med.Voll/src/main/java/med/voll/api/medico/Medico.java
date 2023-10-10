package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

@Table(name = "medicos") // REFERENCIA AO NOME DA TABELA
@Entity(name = "Medico") // REFERENCIA AO NOME DA ENTIDADE NO JPA
@Getter // METODOS GETTSeSETTES utilizando lombook;
@NoArgsConstructor //@NoArgsConstructor é parte do projeto Lombok, que é uma biblioteca do Java que
// permite reduzir a quantidade de código
@AllArgsConstructor

//@EqualsAndHashCode(of = "id") // comparação entre IDs intanciadas para não gerar confilto;


public class Medico {

/*GenerationType.IDENTITY: Esta estratégia geralmente é
usada com bancos de dados que suportam autoincremento.
*/


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //A combinação das anotações @Id e @GeneratedValue é comumente usada para criar uma coluna de identificação única em uma tabela do banco de dados.
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;
    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone  = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());//TIPO ENDERENÇO PASSAR DADOS ENDEREÇO
        this.ativo = true;
    }


    public void atualizarInformacao(DadosAtualizacaoMedico dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null) {
            this.endereco.atualizaInformacao(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
