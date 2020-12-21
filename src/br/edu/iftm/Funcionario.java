package br.edu.iftm;

// Classe do tipo FINAL
public final class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private String funcao;
    private boolean trabalhando;
    private float salario;

    public Funcionario (String nome, int idade, String sexo, String setor, String funcao) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.funcao = funcao;
        this.trabalhando = true;
        this.salario = 1045;
    }

    // Métodos da classe
    // Método tipo FINAL
    public final void receberAumento(float aumento) {
        salario += aumento;
        System.out.format("\nO salario de %s foi aumentado para %.2f\n", getNome(), getSalario());
    }
    public void mudarFuncao(String novaFuncao) {
        funcao = novaFuncao;
        System.out.format("\nFunção alterada para %s\n", getFuncao());
    }

    @Override // Sobrescrita de método
    public void fazerAniversario(){
        System.out.format("\n%s fez aniversario, toda a equipe do setor %s te deseja parabéns.\n", getNome(), getSetor());
    }
    public String toString(){
        String informacao = String.format("\nNome: %s\nIdade: %d anos\nSetor: %s\nFunção: %s\nSalario: %.2f\n", getNome(), getIdade(), getSetor(), getFuncao(),getSalario());
        
        return informacao;
    }
   
    // Get e Set
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }    
}