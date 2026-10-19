package com.mycompany.figuras;

public class Triangulorecto extends Figurarecta {
    public Triangulorecto(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        System.out.println("Se imprime una FiguraPlana...");
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + 
               ", area: " + String.format("%.2f", calcularArea()) + 
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}