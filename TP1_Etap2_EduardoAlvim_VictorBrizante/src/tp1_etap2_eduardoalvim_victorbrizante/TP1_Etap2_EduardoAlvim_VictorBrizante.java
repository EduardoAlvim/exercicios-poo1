package tp1_etap2_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class TP1_Etap2_EduardoAlvim_VictorBrizante {

    public static void main(String[] args) {
        Gerenciamento g = new Gerenciamento();
        Scanner ler = new Scanner(System.in);
        int op = 100;
        while (op != 0) {
            System.out.println("\t\tMENU DE OPCOES");
            System.out.println("(1) - Cadastrar");
            System.out.println("(2) - Consulta");
            System.out.println("(3) - Gerar Folha de Pagamento");
            System.out.println("(4) - Excluir");
            System.out.println("(0) - SAIR ");
            System.out.println("\nSUA ESCOLHA: ");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    g.cadastro();
                    break;
                case 2:
                    g.consultar();
                    break;
                case 3:
                    g.geraFolha();
                    break;
                case 4:
                    g.excluir();
                    break;
            }
        }

    }

}
