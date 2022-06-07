package ex1.lista6;


public class Horista extends Funcionario{
    private float valor=50; 
    private int horas;

    public Horista(int horas, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.horas = horas;
    }

    public float calculaSal() {
        float retorno;
        retorno = valor * horas;
        return retorno;
    }
    public void folhaSalarial(){
        super.folhaSalarial();
        System.out.println("\nSalario: "+calculaSal());
    }
    
}
