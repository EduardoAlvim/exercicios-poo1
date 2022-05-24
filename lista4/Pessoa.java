package ex4.lista4;

public class Pessoa {

    private String nome, telefone, cpf;
    private int anoN;

    public Pessoa(String nome, String telefone, String cpf, int anoN) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        if (anoN >= 1900) {
            this.anoN = anoN;
        } else {
            this.anoN = 1900;
        }
    }

    public void dados() {
        System.out.println("Nome: " + nome + "\nTelefone: " + telefone + "\nCPF: " + cpf + "\nAno de Nascimento: " + anoN);
    }

    public boolean verificaIgualdade(String str, int opcao) {
        if (opcao == 1) {
            if (str.equals(cpf)) {
                return true;
            } else {
                return false;
            }
        } else if (opcao == 2) {
            if (str.equals(nome)) {
                return true;
            } else {
                return false;
            }
        }
        else{
            System.out.println("\nComando invalido");
            return false;
        }
    }
    public void alteraTelefone(String tel){
        telefone =  tel;
    }
}
