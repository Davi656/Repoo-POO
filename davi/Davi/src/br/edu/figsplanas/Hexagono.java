package br.edu.figsplanas;

public class Hexagono {
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
        area = (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    public void listaAtributos() {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
    }
}
