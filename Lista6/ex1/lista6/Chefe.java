package ex1.lista6;


public class Chefe extends Funcionario{
     private float sal=5000;

    public Chefe(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public float calculaSal() {
        return sal;
    }
    public void folhaSalarial(){
        super.folhaSalarial();
        System.out.println("\nSalario: "+calculaSal());
    }
}
