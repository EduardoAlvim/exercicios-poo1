package ex3.lista6;

import java.util.Scanner;

public class Moto extends VeiculoAutomotor{
    private int cilindradas;

    public Moto() {
        super();
        Scanner ler = new Scanner(System.in);
        cilindradas= ler.nextInt();
    }
    public boolean equals(String marca, String modelo, String ano) {
        return super.equals(marca, modelo, ano);
    }
    public String toString(){
        return super.toString()+"\nCilindradas: "+cilindradas;
    }
}
