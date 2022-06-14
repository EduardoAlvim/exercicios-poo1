package ex3.lista6;

public class Onibus extends VeiculoAutomotor{
    private static final int passageiros=50;

    public Onibus() {
        super();
    }
    public boolean equals(String marca, String modelo, String ano) {
        return super.equals(marca, modelo, ano);
    }
    public String toString(){
        return super.toString()+"\nNúmero máximo de passageiros: "+passageiros;
    }
}
