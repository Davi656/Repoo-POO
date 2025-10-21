package br.edu.figsplanas;

public class Pentagono {
    private double lado;
    private double apotema;
    private double area;

    public void recebeLado(double l) {
        lado = l;
    }

    public void recebeApotema(double a) {
        apotema = a;
    }

    public double retornaLado() {
        return lado;
    }

    public double retornaApotema() {
        return apotema;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = (5 * lado * apotema) / 2;
    }

    public void listaAtributos() {
        System.out.println("Lado: " + lado);
        System.out.println("Apótema: " + apotema);
        System.out.println("Área: " + area);
    }
}
