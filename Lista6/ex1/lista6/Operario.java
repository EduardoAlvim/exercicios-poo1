package ex1.lista6;


public class Operario extends Funcionario{
    private float valor=250;
    private int quantidade;

    public Operario(int quantidade, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.quantidade = quantidade;
    }

    public float calculaSal() {
        float retorno;
        retorno = valor * quantidade;
        return retorno;
    }
    public void folhaSalarial(){
        super.folhaSalarial();
        System.out.println("\nSalario: "+calculaSal());
    }
}
