package Ejercicios.test;

import Ejercicios.clases.Auto;

public class TestAuto {
    public static void main(String[] args) {
        Auto a = new Auto();
        System.out.println(a.informacion());
        a.cambiarVelocidad(30,60);
        System.out.println(a.informacion());
        a.cambiarVelocidad(-5,60);
        System.out.println(a.informacion());
        a.cambiarVelocidad(-5,80);
        System.out.println(a.informacion());
    }
}