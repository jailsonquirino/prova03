package br.edu.iftm;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Marcos", 35, "Masculino", "Uber", "Motorista");
        Cliente cliente1 = new Cliente("Pedro", 20, "Masculino");

        System.out.println(funcionario1);
        funcionario1.fazerAniversario();
        funcionario1.receberAumento(300);
        funcionario1.mudarFuncao("Motorista");
        System.out.println(funcionario1);

        System.out.println(cliente1);
        cliente1.fazerAniversario();
        cliente1.compraAprazo(500);
        cliente1.emitirBoleto();
        System.out.println(cliente1);

    }
    
}