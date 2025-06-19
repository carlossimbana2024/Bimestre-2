package grafica.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JPanel panel1;
    private JButton btnRestar;
    private JButton btnSumar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txtResultado;

    public  Calculadora(){
        setTitle("CALCULADORA BÁSICA");
        setSize(500,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt1.getText());
                double n2 = Double.parseDouble(txt2.getText());
                double result = n1+n2;
                txtResultado.setText(String.valueOf(result));
            }

        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt1.getText());
                double n2 = Double.parseDouble(txt2.getText());
                double result = n1-n2;
                txtResultado.setText(String.valueOf(result));
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt1.getText());
                double n2 = Double.parseDouble(txt2.getText());
                double result = n1*n2;
                txtResultado.setText(String.valueOf(result));
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt1.getText());
                double n2 = Double.parseDouble(txt2.getText());
                double result = n1/n2;
                txtResultado.setText(String.valueOf(result));
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(() ->{
            new Calculadora().setVisible(true);
        });
    }
}
