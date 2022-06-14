package ex3.lista6;

import java.util.Scanner;


public abstract class VeiculoAutomotor {
    private String marca, modelo, placa, anoFabric;

    public VeiculoAutomotor() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        marca = ler.nextLine();
        System.out.println("Digite o modelo: ");
        modelo = ler.nextLine();
        System.out.println("Digite a placa: ");
        placa = ler.nextLine();
        System.out.println("Digite o ano de fabricação: ");
        anoFabric = ler.nextLine();
    }
    public boolean equals(String marca, String modelo, String ano){
        if(this.marca == marca && this.modelo == modelo && anoFabric ==  ano){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "Marca: " +marca+"\nModelo: "+modelo+"\nPlaca: "+placa+"\nAno de Fabricação: "+anoFabric;
    }
}
