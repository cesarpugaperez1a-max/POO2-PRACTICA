package com.mycompany.figuras;

public class App {
    public static void main(String[] args) {
        Figura2d f = new Triangulorecto(3, 4);
        System.out.println(f.imprimeFigura());
        
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}