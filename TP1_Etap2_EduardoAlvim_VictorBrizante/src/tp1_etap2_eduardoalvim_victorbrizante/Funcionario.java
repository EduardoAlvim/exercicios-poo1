package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public abstract class Funcionario {

    private String nome, dataNascimento, cpf;
    private int codigo;

    public Funcionario(String nome, String dataNascimento, String cpf, int codigo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    public void exclui() {
        nome = null;
        dataNascimento = null;
        cpf = null;
        codigo = 0;
    }

    public void cadastro() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a data de nascimento: ");
        dataNascimento = ler.nextLine();
        System.out.println("Digite o CPF: ");
        cpf = ler.nextLine();
        System.out.println("Digite o codigo: ");
        codigo = ler.nextInt();
    }

    public void folhaSalarial() {
        System.out.println("Nome: " + nome + "\nData de nascimento: " + dataNascimento + "\nCPF: " + cpf + "\nCodigo: " + codigo);
    }

    public int getCodigo() {
        return codigo;
    }

}
