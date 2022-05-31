package ex1.lista5;

import java.util.Scanner;


public class Secretaria extends Funcionario{
    private int ramal;

    public Secretaria() {
        ramal=0;
    }

    public void cadastrar() {
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Digite seu ramal: ");
        ramal = ler.nextInt();
    }
    
    public void dados() {
        super.dados();
        System.out.println("\nRamal: " +ramal);
    }
}
