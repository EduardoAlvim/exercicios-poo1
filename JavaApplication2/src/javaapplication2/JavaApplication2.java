package javaapplication2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaApplication2 extends JFrame {

    public JavaApplication2() {
        super("Primeira janela");
        configurarPaineis();
        this.setSize(600, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        add(BorderLayout.CENTER, pTela);
    }

    private JPanel pTela = new JPanel(new GridLayout(0, 2, 15, 15));
    private JLabel rotulos[] = new JLabel[4];
    private JTextField camposTexto[] = new JTextField[4];
    private JButton bCalcular = new JButton("Calcular");
    private JButton bReiniciar = new JButton("Reiniciar");

    private void configurarPaineis() {
        rotulos[0] = new JLabel("Capital: ");
        rotulos[1] = new JLabel("Taxa (% a.m.): ");
        rotulos[2] = new JLabel("Tempo (em meses): ");
        rotulos[3] = new JLabel("Juros: ");
        for (int i = 0; i < 4; i++) {
            camposTexto[i] = new JTextField(" ");
        }
        for (int i = 0; i < 3; i++) {
            pTela.add(rotulos[i]);
            pTela.add(camposTexto[i]);
        }
        pTela.add(bReiniciar);
        pTela.add(bCalcular);
        pTela.add(rotulos[3]);
        pTela.add(camposTexto[3]);
        camposTexto[3].setEditable(false);
        bCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                for (int i = 0; i < 4; i++) {
                    camposTexto[i].setText(" ");
                }
            }
        });
        bReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                for (int i = 0; i < 4; i++) {
                    camposTexto[i].setText(" ");
                }
            }
        });
    }

    public static void main(String[] args) {
        JavaApplication2 j = new JavaApplication2();
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
