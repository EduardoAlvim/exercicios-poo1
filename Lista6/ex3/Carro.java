package ex3.lista6;

import java.util.Scanner;

public class Carro extends VeiculoAutomotor {

    private float litros;

    public Carro() {
        super();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros no porta-malas: ");
        litros = ler.nextFloat();
    }

    public boolean equals(String marca, String modelo, String ano) {
        return super.equals(marca, modelo, ano);
    }
    public String toString(){
        return super.toString()+"\nQuantidade de litros no porta-malas: "+litros;
    }
    
}
