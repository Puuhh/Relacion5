package Ejercicios;

import java.util.Scanner;

import Funciones.Funciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Con que numero quieres rellenar?");
		int num = teclado.nextInt();
		
		Funciones.inicializarMatriz(matriz, num);
		System.out.println("Tu matriz es: ");
		Funciones.mostrarMatriz(matriz);
		
	}

}
