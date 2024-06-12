package classes.contato;

public class contato {
    private String nome;
    private String numero;

    public contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {  
        this.numero = numero;
    }
}
