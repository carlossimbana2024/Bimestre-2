package grafica.clases;

import javax.swing.*;


public class Estado extends JFrame {
    private JPanel j_Panel1;
    private JComboBox comboBox1;
    private JButton enviarButton;
    private JLabel J_Panel1;

    public Estado() {

        setTitle("CALCULADORA BÁSICA");

        setSize(500, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(j_Panel1);

        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Estado().setVisible(true);
        });
    }
}
