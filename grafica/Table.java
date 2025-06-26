package grafica;

import grafica.clases.Calculadora;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame {
    private JPanel panel1;
    private JTable tablaMaterias;

    public Table() {
        setTitle("TABLA MATERIAS");
        setSize(800, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        cargartablaMaterias();
    }

    private void cargartablaMaterias(){
        String[] columnas = {" ","Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        Object[] [] datos = {
                {"7h00", "BASES DE DATOS", "GESTIÓN DE PROYECTOS DE SOFTWARE", "GESTIÓN DE PROYECTOS DE SOFTWARE", "PROGRAMACIÓN ORIENTADA A OBJETOS"},
                {"8h00", "", },
                {"9h00", "", },
                {"10h00", "","ANALISIS DE DATOS", " ", " ", "DISEÑO DE INTERFACES" },
                {"11h00", "PROGRMACIÓN ORIENTADA A OBJETOS"," ","BASES DE DATOS" },
                {"12h00", "", },
                {"13h00", "", },
                {"14h00", "", },
                {"15h00", "", },
                {"16h00", "", },
        };
    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
    tablaMaterias.setModel(modelo);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Table().setVisible(true);
        });
    }
}
