package br.edu.iftm;

public class Cliente extends Pessoa {
    // Atributos
    private int id;
    private float saldoDevedor;
    private float saldoCredito;

    public Cliente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.saldoDevedor = 0 ;
        this.id += 1;
    }

    // Métodos da classe
    public void emitirBoleto() {
        System.out.format("\nBoleto de %.2f reais está sendo imprimido\n", getSaldoDevedor());
    }
    public String toString(){
        String informacao = String.format("\nNome cliente: %s\nIdade: %d anos\nSaldo devedor: %.2f\nSaldo credito: %.2f\nID: %d", getNome(), getIdade(), getSaldoDevedor(), getSaldoCredito(), getId());
        
        return informacao;
    }
    public void compraAprazo(float valor) {
        saldoDevedor += valor;
        System.out.format("\n%s fez uma compra a prazo no valor de %.2f reais.\n", getNome(), valor);
    }

    // Get e Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getSaldoDevedor() {
        return saldoDevedor;
    }
    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
    public float getSaldoCredito() {
        return saldoCredito;
    }
    public void setSaldoCredito(float saldoCredito) {
        this.saldoCredito = saldoCredito;
    }
    
}
