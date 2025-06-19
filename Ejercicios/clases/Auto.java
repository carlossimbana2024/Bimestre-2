package Ejercicios.clases;

public class Auto {
    private double velocidad = 0.0;//km/h
    private double combustible = 10;//Galones
    private double tiempoR=0;

    public double cambiarVelocidad(double cambio, double tiempo){
        if ((velocidad + cambio)<0||(velocidad + cambio)>100){
            System.out.println("La velocidad no puede ser negativa o exeder los 100 hm/h");
        }else {
            velocidad = velocidad + cambio;
            tiempoR = tiempoR + tiempo;
            combustible = (200 - tiempoR) / 20;
            if (combustible>0){
                velocidad = velocidad + cambio;
            }else {
                velocidad = 0.0;
                System.out.println("El auto se ha detenido");
            }
        }
        return velocidad;

   }

    public String informacion(){
        return "Velocidad  del auto: "+ velocidad+"km/h"+
                "\nGasolina en el tanque: "+combustible+"--> Tiempo recorrido: "+tiempoR+ " Gasolina en el tanque: "+(combustible)+" galones";
    }
}