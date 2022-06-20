package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Vendedor extends Funcionario {

    private float salario = 1300, comissao = 65;
    private int vendas;

    public Vendedor() {
    }

    public float calculaSalario() {
        float retorno;
        retorno = salario + (float) vendas * comissao;
        return retorno;
    }

    public void cadastro() {
        super.cadastro();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de vendas feitas: ");
        vendas = ler.nextInt();
        salario = calculaSalario();
    }

    public void folhaSalarial() {
        super.folhaSalarial();
        System.out.println("\nNumero de vendas: " + vendas + "\nSalario: " + salario);
    }

    public void altera(int codigo) {
        if (codigo == super.getCodigo()) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a nova quantidade de vendas feitas: ");
            vendas = ler.nextInt();
            System.out.println("Quantidade de vendas alteradas");
        }
    }
}
