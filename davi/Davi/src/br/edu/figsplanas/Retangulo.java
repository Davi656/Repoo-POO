package br.edu.figsplanas;

public class Retangulo {
    private double base;
    private double altura;
    private double area;

    public void recebeBase(double b) {
        base = b;
    }

    public void recebeAltura(double h) {
        altura = h;
    }

    public double retornaBase() {
        return base;
    }

    public double retornaAltura() {
        return altura;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = base * altura;
    }

    public void listaAtributos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}

