package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M), decir si la matriz así representada es triangular 
		//inferior
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige un numero para tu matriz cuadrada");
		int num=teclado.nextInt();
		int matriz [][] = new int [num][num];
		System.out.println("Rellena tu matriz");
		Funciones.pedirMatriz(matriz);
		System.out.println("Tu matriz es");
		Funciones.mostrarMatriz(matriz);
		if (Funciones.triangularinferior(matriz))
			System.out.println("Es una triangular inferior");
		else System.out.println("No es una triangular inferior");

	}

}
