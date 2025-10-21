package br.edu.figsplanas;
public class Losango {
    private double diagonalMaior;
    private double diagonalMenor;
    private double area;

    public void recebeDiagonalMaior(double d) {
        diagonalMaior = d;
    }

    public void recebeDiagonalMenor(double d) {
        diagonalMenor = d;
    }

    public double retornaDiagonalMaior() {
        return diagonalMaior;
    }

    public double retornaDiagonalMenor() {
        return diagonalMenor;
    }

    public double retornaArea() {
        return area;
    }

    public void calcArea() {
        area = (diagonalMaior * diagonalMenor) / 2;
    }

    public void listaAtributos() {
        System.out.println("Diagonal Maior: " + diagonalMaior);
        System.out.println("Diagonal Menor: " + diagonalMenor);
        System.out.println("Área: " + area);
    }
}
