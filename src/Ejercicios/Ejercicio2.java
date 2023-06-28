package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero.
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Rellena la matriz");
		Funciones.pedirMatriz(matriz);
		if(Funciones.comprobar(matriz))
			System.out.printf("Los numeros son todos cero");
		else System.out.println("Los numeros no son cero");

	}

}
