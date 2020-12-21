package br.edu.iftm;

// Classe tipo ABSTRACT
public abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos da classe
    public void fazerAniversario(){
        System.out.format("%s fez aniversario, Parabéns.\n", getNome());
    }

    // Get e Set
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
}