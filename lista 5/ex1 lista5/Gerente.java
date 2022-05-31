package ex1.lista5;

import java.util.Scanner;

public class Gerente extends Funcionario {

    private int usuario;
    private String senha;

    public Gerente() {
        usuario = 0;
        senha = "Default";
    }
    
    

    public void cadastrar() {
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        usuario = ler.nextInt();
        System.out.println("Digite sua senha: ");
        senha = str.nextLine();
    }

    public void dados() {
        super.dados();
        System.out.println("\nUsuario: " + usuario + "\nSenha: " + senha);
    }
}
