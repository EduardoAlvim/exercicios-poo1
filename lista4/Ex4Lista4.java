package ex4.lista4;

import java.util.Scanner;

public class Ex4Lista4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Pessoa[] p = new Pessoa[3];
        String nome, telefone, cpf;
        int ano;
        int aux = 0;
        System.out.println("Digite o cpf: ");
        cpf = ler.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = ler.nextLine();
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        ano = ler2.nextInt();
        p[0] = new Pessoa(nome, telefone, cpf, ano);
        for (int i = 1; i < 3; i++) {
            aux = 0;
            System.out.println("Digite o cpf: ");
            cpf = ler.nextLine();
            for (int j = 0; j < i; j++) {
                if (p[j].verificaIgualdade(cpf, 1) == true) {
                    aux++;
                }
            }
            if (aux == 0) {
                System.out.println("Digite o telefone: ");
                telefone = ler.nextLine();
                System.out.println("Digite seu nome: ");
                nome = ler.nextLine();
                System.out.println("Digite o ano de nascimento: ");
                ano= ler2.nextInt();
                p[i] = new Pessoa(nome, telefone, cpf, ano);
            } else {
                System.out.println("CPF ja existe");
            }
        }
        
        

    }

}
