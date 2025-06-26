package ficheros.clases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Escritura {
    //Metodos para leer el archivo
    private FileWriter fichero = null;
    private PrintWriter pw = null;

    public void escribirFichero(String info, String ruta) {
        try (FileWriter fichero = new FileWriter(ruta, true);
             PrintWriter pw = new PrintWriter(fichero)) {
            pw.println(info);
            System.out.println("Archivo creado exitosamante");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    public void actualizarFichero(String info, String ruta) {
        try (FileWriter fichero = new FileWriter(ruta,true)) {
            PrintWriter pw = new PrintWriter(fichero);

            pw.println(info);
            System.out.println("Archivo actualizado exitosamente");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public <T> void escribirLista(String ruta, ArrayList<T> lista){
        try (FileWriter fw = new FileWriter(ruta, true);
        PrintWriter pw = new PrintWriter(fw)){

            for (T item : lista){
                pw.println(item); //Se usa el metodo to String()
            }
            System.out.println("Lista escrita exitosamente.");
        }catch (IOException e){
            System.err.println("Error al escribir el archivo: "+e.getMessage());
        }
    }
}