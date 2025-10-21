package br.edu.figsplanas;
public class Quadrado {
    private double lado;
    private double area;

    public void recebeLado(double l) {
        lado = l;
    }

    public double retornaLado() {
        return lado;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = lado * lado;
    }

    public void listaAtributos() {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
    }
}
