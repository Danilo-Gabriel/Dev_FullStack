package exPOO;

public class Empresa {
    private String nome;
    private String CNPJ;
    public Empresa(String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
