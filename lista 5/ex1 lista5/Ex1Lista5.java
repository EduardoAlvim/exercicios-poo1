package ex1.lista5;

public class Ex1Lista5 {

    public static void main(String[] args) {
        Secretaria[] s = new Secretaria[2];
        s[0] = new Secretaria();
        s[1] = new Secretaria();
        Gerente g = new Gerente();
        g.cadastrar();
        s[0].cadastrar();
        s[1].cadastrar();
        g.dados();
        s[0].dados();
        s[1].dados();
    }

}
