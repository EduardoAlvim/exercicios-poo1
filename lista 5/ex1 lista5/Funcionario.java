package ex1.lista5;

import java.util.Scanner;

public class Funcionario {

    private String nome;
    private float salario;

    public Funcionario() {
        nome = "Default";
        salario = 0;
    }

    public void cadastrar() {
        Scanner ler = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = str.nextLine();
        System.out.println("Digite seu salario: ");
        salario = ler.nextFloat();

    }

    public void dados() {
        System.out.println("Nome: " + nome + "\nSalario: " + salario);
    }
}
