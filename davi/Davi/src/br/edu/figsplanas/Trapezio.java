package br.edu.figsplanas;

public class Trapezio {
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double area;

    public void recebeBaseMaior(double b) {
        baseMaior = b;
    }

    public void recebeBaseMenor(double b) {
        baseMenor = b;
    }

    public void recebeAltura(double h) {
        altura = h;
    }

    public double retornaBaseMaior() {
        return baseMaior;
    }

    public double retornaBaseMenor() {
        return baseMenor;
    }

    public double retornaAltura() {
        return altura;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = ((baseMaior + baseMenor) * altura) / 2;
    }

    public void listaAtributos() {
        System.out.println("Base Maior: " + baseMaior);
        System.out.println("Base Menor: " + baseMenor);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
