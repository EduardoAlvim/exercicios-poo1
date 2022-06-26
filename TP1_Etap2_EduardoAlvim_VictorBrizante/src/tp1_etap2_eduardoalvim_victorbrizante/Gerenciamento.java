package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Gerenciamento {

    Gerente[] g = new Gerente[100];
    Vendedor[] v = new Vendedor[100];
    int cg = 0, cv = 0;

    public void cadastro() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 se deseja cadastrar o gerente e 2 para um vendedor: ");
        int resp;
        resp = ler.nextInt();
        if (resp == 1) {
            g[cg] = new Gerente("e", "n", "d", "c", 1);
            g[cg].cadastro();
            cg++;
            System.out.println("Gerente cadastrado!");
        } else if (resp == 2) {
            v[cv] = new Vendedor(0, "n", "d", "c", 1);
            v[cv].cadastro();
            cv++;
            System.out.println("Vendedor cadastrado!");
        } else {
            System.out.println("CODIGO INVALIDO");
        }
    }

    public void consultar() {
        Scanner ler = new Scanner(System.in);
        int op, cod;
        System.out.println("Digite 1 se deseja CONSULTAR o gerente e 2 para um vendedor: ");
        System.out.println("Caso não apareça -> nao ha gerente com esse codigo");
        op = ler.nextInt();
        if (op == 1) {
            System.out.println("\nDigite o codigo do gerente: ");
            cod = ler.nextInt();
            for (int i = 0; i < cg; i++) {
                g[i].consulta(cod);
            }
        } else if (op == 2) {
            System.out.println("Digite o codigo do vendedor: ");
            System.out.println("Caso não apareça -> nao ha vendedor com esse codigo");
            cod = ler.nextInt();
            for (int i = 0; i < cv; i++) {
                v[i].consulta(cod);
            }

        } else {
            System.out.println("CODIGO INVALIDO");
        }

    }

    public void geraFolha() {
        System.out.println("Gerentes:");
        for (int i = 0; i < cg; i++) {
            System.out.printf("\nGerente %d", i + 1);
            g[i].folhaSalarial();
        }
        System.out.println("\n \n");
        System.out.println("Vendedores:");
        for (int i = 0; i < cv; i++) {
            System.out.printf("\nVendedor %d", i + 1);
            v[i].folhaSalarial();
        }

    }

    public void excluir() {
        Scanner ler = new Scanner(System.in);
        int op, cod;
        System.out.println("Digite 1 se deseja EXCLUIR o gerente e 2 para um vendedor: ");
        op = ler.nextInt();
        if (op == 1) {
            System.out.println("\nDigite o codigo do gerente: ");
            cod = ler.nextInt();
            for (int i = 0; i < cg; i++) {
                g[i].exclui(cod);
            }
        } else if (op == 2) {
            System.out.println("Digite o codigo do vendedor: ");
            cod = ler.nextInt();
            for (int i = 0; i < cv; i++) {
                v[i].exclui(cod);
            }

        } else {
            System.out.println("CODIGO INVALIDO");
        }
    }

}
