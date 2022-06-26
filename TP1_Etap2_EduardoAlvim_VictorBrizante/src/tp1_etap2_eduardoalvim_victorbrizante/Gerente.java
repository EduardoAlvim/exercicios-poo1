package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Gerente extends Funcionario {

    private String email;
    private float salario = 10000;

    public Gerente(String email, String nome, String dataNascimento, String cpf, int codigo) {
        super(nome, dataNascimento, cpf, codigo);
        this.email = email;
    }

    public void cadastro() {
        super.cadastro();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o E-Mail do gerente: ");
        email = ler.nextLine();
        if (email.contains("@") == false || email.contains(".com") == false) {
            System.out.println("Email invalido, inserindo o email padrão");
            email = "emaildogerente@gmail.com";
        }
    }

    public void folhaSalarial() {
        if (email != null) {
            super.folhaSalarial();
            System.out.println("\nEmail: " + email + "\nSalario: " + salario);
        }
    }

    public void exclui(int codigo) {
        if (super.getCodigo() == codigo) {
            super.exclui();
            email = null;
            salario = 0;
        }
    }

    public void consulta(int codigo) {
        if (super.getCodigo() == codigo) {
            folhaSalarial();
        }
    }
}
