package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, buscar el máximo valor almacenado
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
		System.out.printf("Este es el valor maximo %d", Funciones.maxnum(matriz));
	}

}
