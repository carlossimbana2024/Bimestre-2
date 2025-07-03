package graficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class hoja_de_vida extends JFrame {
    private JPanel JPanel1;
    private JTextField textField1;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JRadioButton otroRadioButton;
    private JCheckBox leerCheckBox;
    private JCheckBox viajarCheckBox;
    private JCheckBox otroCheckBox;
    private JTextArea textAreaExperiencia;
    private JComboBox comboBox1;
    private JTextArea textAreaFormacion;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton salirButton;

    public hoja_de_vida() {
        setTitle("HOJA DE VIDA");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);
        setLocationRelativeTo(null);

        // Botón Guardar
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        // Botón Limpiar
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
            }
        });

        // Botón Salir
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana
            }
        });
    }

    private void guardarDatos() {
        StringBuilder datos = new StringBuilder();

        datos.append("Nombre y Apellido: ").append(textField1.getText()).append("\n");

        if (masculinoRadioButton.isSelected()) datos.append("Género: Masculino\n");
        else if (femeninoRadioButton.isSelected()) datos.append("Género: Femenino\n");
        else if (otroRadioButton.isSelected()) datos.append("Género: Otro\n");

        datos.append("Hobbies: ");
        if (leerCheckBox.isSelected()) datos.append("Leer ");
        if (viajarCheckBox.isSelected()) datos.append("Viajar ");
        if (otroCheckBox.isSelected()) datos.append("Otro ");
        datos.append("\n");

        datos.append("Experiencia Laboral:\n").append(textAreaExperiencia.getText()).append("\n");
        datos.append("Nivel de Instrucción: ").append(comboBox1.getSelectedItem()).append("\n");
        datos.append("Formación Académica:\n").append(textAreaFormacion.getText()).append("\n");

        try (FileWriter writer = new FileWriter("C:/Users/Asus/Desktop/Tercer semestre/programación orientada a objetos/hoja_de_vida.txt", true)) {
            writer.write(datos.toString());
            writer.write("-----------------------------------------------------\n");
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + ex.getMessage());
        }
    }

    private void limpiarFormulario() {
        textField1.setText("");
        masculinoRadioButton.setSelected(false);
        femeninoRadioButton.setSelected(false);
        otroRadioButton.setSelected(false);
        leerCheckBox.setSelected(false);
        viajarCheckBox.setSelected(false);
        otroCheckBox.setSelected(false);
        textAreaExperiencia.setText("");
        comboBox1.setSelectedIndex(0);
        textAreaFormacion.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new hoja_de_vida().setVisible(true);
        });
    }
}
