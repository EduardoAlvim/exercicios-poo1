package ex1.lista6;

import java.util.Scanner;


public class Vendedor extends Funcionario{
    private float valor=1300 ,comissao;
    private int vendas;

    public Vendedor(float comissao, int vendas, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.comissao = comissao;
        this.vendas = vendas;
    }
    
    public float calculaSal() {
        float retorno;
        retorno = 1300 + comissao*vendas;
        return retorno;
    }
    public void folhaSalarial(){
        super.folhaSalarial();
        System.out.println("\nSalario: "+calculaSal());
    }
}
