package model;

public class Cavaleiro {
    private int id;
    private String nome;
    private String constelacao;
    private String nivel;
    private String afiliacao;

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getConstelacao() {
        return constelacao;
    }

    public String getNivel() {
        return nivel;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConstelacao(String constelacao) {
        this.constelacao = constelacao;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }
}
