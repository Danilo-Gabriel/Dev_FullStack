package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    /*
    A interface MedicoRepository que você está mostrando é uma interface de repositório definida em um projeto que usa o Spring Data JPA. Ela estende a interface JpaRepository do Spring Data JPA e é usada para realizar operações de consulta e manipulação no banco de dados relacionado à entidade Medico.

Aqui estão algumas explicações sobre o que essa interface faz:

MedicoRepository: É uma interface que estende outra interface chamada JpaRepository. Ela é usada para acessar e manipular dados relacionados à entidade Medico. O nome da interface geralmente segue uma convenção de nomenclatura que combina o nome da entidade (no seu caso, Medico) com "Repository".

JpaRepository<Medico, Long>: Esta é a parte onde você especifica o tipo da entidade (Medico) e o tipo da chave primária (Long). O JpaRepository é um tipo genérico e a primeira classe genérica (Medico) representa a entidade com a qual você está trabalhando, enquanto o segundo (Long) representa o tipo da chave primária dessa entidade.

Através dessa interface, você obtém automaticamente uma série de métodos para realizar operações de banco de dados, como criar, ler, atualizar e excluir (CRUD), bem como consultas personalizadas. Esses métodos incluem, por exemplo:

save: Para salvar uma nova entidade ou atualizar uma entidade existente no banco de dados.
findById: Para buscar uma entidade pelo seu ID.
findAll: Para buscar todas as entidades do tipo Medico.
delete: Para excluir uma entidade.
Você não precisa implementar esses métodos, pois o Spring Data JPA gera automaticamente as consultas SQL necessárias com base nos nomes dos métodos e na estrutura da entidade. Isso é conhecido como consultas derivadas.
     */

}
