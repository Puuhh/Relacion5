package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de reales, decir si la matriz así representada es 
		// triangular superior
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige un numero para tu matriz cuadrada");
		int num=teclado.nextInt();
		int matriz [][] = new int [num][num];
		System.out.println("Rellena tu matriz");
		Funciones.pedirMatriz(matriz);
		System.out.println("Tu matriz es");
		Funciones.mostrarMatriz(matriz);
		if (Funciones.triangularsuperior(matriz))
			System.out.println("Es una triangular superior");
		else System.out.println("No es una triangular superior");
	}

}
