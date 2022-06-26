package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Vendedor extends Funcionario {

    private float salario = 1300, comissao = 65;
    private int vendas;

    public Vendedor(int vendas, String nome, String dataNascimento, String cpf, int codigo) {
        super(nome, dataNascimento, cpf, codigo);
        this.vendas = vendas;
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
        if (vendas < 0) {
            System.out.println("Quantidade de vendas invalida, as vendas serão igualadas a zero");
            vendas = 0;
        }
        salario = calculaSalario();
    }

    public void folhaSalarial() {
        if (vendas != -1) {
            super.folhaSalarial();
            System.out.println("\nNumero de vendas: " + vendas + "\nSalario: " + salario);
        }
    }

    public void exclui(int codigo) {
        if (super.getCodigo() == codigo) {
            super.exclui();
            vendas = -1;
            salario = 0;
            comissao = 0;
        }
    }

    public void consulta(int codigo) {
        if (super.getCodigo() == codigo) {
            folhaSalarial();
        }
    }
}
