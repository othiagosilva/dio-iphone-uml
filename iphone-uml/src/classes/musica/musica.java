package classes.musica;
public class musica {
    private String nome;
    private String diretorio;

    public musica(String nome, String diretorio) {
        this.nome = nome;
        this.diretorio = diretorio;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }
}
