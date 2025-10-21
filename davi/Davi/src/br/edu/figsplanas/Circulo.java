package br.edu.figsplanas;

public class Circulo {
    private double raio;
    private double area;

    public void recebeRaio(double r) {
        raio = r;
    }

    public double retornaRaio() {
        return raio;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = Math.PI * raio * raio;
    }

    public void listaAtributos() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
    }
}
