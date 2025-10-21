 package br.edu.figsplanas;
 
 import java.util.Scanner;

 public class Triangulo {
	
	private double base;
	private double altura;
	private double area;

	public Triangulo() {
		
	}
	public void recebealtura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
	}
	public void recebeAltura(double h ) {
		altura = h;
	}
	public void recebeBase(double b) {
		base = b;
	}
	
	
	public void retornaBase() {
		System.out.println("A altura do triangulo é: "+ altura);
	}	
	public void retornaAltura() {
		System.out.println("A base do triangulo é:"+ base);
	}
	public void retornaArea() {
		System.out.println("A area do triangulo é"+ area);
	}
	public void calcArea() {
		area = (base * altura)/2;
	}
	public void listaAtributos() {
		System.out.println("A area do triangulo é:"+ area);
		System.out.println("A base do triangulo é:"+ base);
		System.out.println("A altura do triangulo é:"+ altura);
		System.out.println("----------------------------------");
		
	}
}
