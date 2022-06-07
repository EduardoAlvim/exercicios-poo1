package ex1.lista6;


public abstract class Funcionario {
    private String nome, dataNascimento;

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public abstract float calculaSal();
    public void folhaSalarial(){
        System.out.println("Nome: "+nome+"\nData de nascimento: "+dataNascimento);
    }
}
