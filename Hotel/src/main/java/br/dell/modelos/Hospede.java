package br.dell.modelos;
/**
 *
 * @author Iris Mayara
 */
public class Hospede {
    private long CPF;
    private long RG;
    private String nome;
    private int idade;
    private String endereco;

    public Hospede() {
    }

    public Hospede(long CPF, long RG, String nome, int idade, String endereco) {
        this.CPF = CPF;
        this.RG = RG;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
    
}
