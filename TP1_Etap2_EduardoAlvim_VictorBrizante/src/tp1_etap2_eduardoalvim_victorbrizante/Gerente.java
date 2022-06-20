package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Gerente extends Funcionario {

    private String email;
    private float salario = 10000;

    public Gerente() {
    }

    public void cadastro() {
        super.cadastro();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o E-Mail do gerente: ");
        email = ler.nextLine();
    }

    public void folhaSalarial() {
        super.folhaSalarial();
        System.out.println("\nEmail: " + email + "\nSalario: " + salario);
    }

    public void altera(int codigo) {
        if (codigo == super.getCodigo()) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o novo E-Mail do Gerente: ");
            email = ler.nextLine();
            System.out.println("E-Mail do gerente alterado!");
        }
    }
}
