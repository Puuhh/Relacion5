package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un 
		//número A dado.
			// Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero.
			Scanner teclado = new Scanner(System.in);
			System.out.println("¿Cuantas filas quieres:?");
			int filas = teclado.nextInt();
			
			System.out.println("¿Cuantas columnas quieres:?");
			int columnas = teclado.nextInt();
			
			int matriz [][] = new int [filas][columnas];
			
			System.out.println("Rellena la matriz");
			Funciones.pedirMatriz(matriz);
			System.out.println("Esta es tu matriz");
			Funciones.mostrarMatriz(matriz);
			System.out.println("Elige un numero a contar");
			int num=teclado.nextInt();
			System.out.printf("Hay %d unidades de %d", Funciones.cuentaveces(matriz, num), num);

	}

}
