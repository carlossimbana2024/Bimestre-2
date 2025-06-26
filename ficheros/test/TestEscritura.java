package ficheros.test;

import ficheros.clases.Empleado;
import ficheros.clases.Escritura;

import java.util.ArrayList;
import java.util.List;

public class TestEscritura {
    public static void main(String[] args) {
        Escritura es = new Escritura();
        Escritura lista = new Escritura();

//        es.escribirFichero("dias","C:/Users/POO/Desktop/poo/dias.txt");
//        es.escribirFichero("lunes","C:/Users/POO/Desktop/poo/dias.txt");
//        es.escribirFichero("martes","C:/Users/POO/Desktop/poo/dias.txt");
//        es.escribirFichero("miercoles","C:/Users/POO/Desktop/poo/dias.txt");
//        es.escribirFichero("jueves","C:/Users/POO/Desktop/poo/dias.txt");
//        es.escribirFichero("viernes","C:/Users/POO/Desktop/poo/dias.txt");
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Carlos Simbaña","gerente", 2323));
        empleados.add(new Empleado("Gabriel Perez","jefe", 2323));
        empleados.add(new Empleado("Oscar Vasquez","subjerente", 900));
        empleados.add(new Empleado("Ariel Paz","analista", 850));
        empleados.add(new Empleado("Pedro Mena","desarrollador", 560));
        empleados.add(new Empleado("Luis Enrique","diseñador", 600));
        empleados.add(new Empleado("Jose Eduardo","pasante", 500));

        es.escribirFichero("nombre,cargo,sueldo", "C:/Users/POO/Desktop/poo/empleados2.csv");
        for (Empleado e: empleados){
            es.actualizarFichero(e.toString(),"C:/Users/POO/Desktop/poo/empleados2.csv");
        }
        es.escribirLista("C:/Users/POO/Desktop/poo/empleados3.csv",(ArrayList<Empleado>) empleados);
    }
}