package Funciones;

import java.util.Scanner;

	public class Funciones {
		public static void pedirMatriz(int m[][]) {
			Scanner teclado = new Scanner(System.in);
			for (int fila=0; fila<m.length;fila++) {
				for(int col=0;col<m[0].length;col++) {
					System.out.printf("Introduce el elemento (%d,%d):",fila,col);
					m[fila][col]=teclado.nextInt();
				}
			}
		}
	
	public static void mostrarMatriz(int m[][]) {
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
				System.out.printf("%d ",m[fila][col]);
			}
			System.out.println();
		}
	}
	
	public static void inicializarMatriz(int m[][], int num) {
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
					m[fila][col]=num;
			
			}
		}
	}
	
	public static boolean comprobar(int m[][]) {
		boolean comprobar=true;
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++)
				if (m[fila][col]!=0)
					comprobar=false;			
		}
		return comprobar;
	}
	
	public static int cuentaveces(int m[][], int num) {
		int contador=0;
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++)
				if ((m [fila][col])==num)
					contador=contador+1;
				


		}
		return contador;
	}
	
	public static boolean triangularsuperior(int m [][]) {
		boolean triangular=true;
		for(int fila=1; fila<m.length; fila++) {
			for (int col=0; col<fila; col++)
				if(m[fila][col]!=0) {
					triangular=false;
				}
		}
		return triangular;
	}
	
	public static boolean triangularinferior(int m [][]) {
		boolean triangular=true;
		for(int fila=0; fila<m.length-1; fila++) {
			for (int col=fila+1; col<m[0].length; col++)
				if(m[fila][col]!=0) {
					triangular=false;
				}
		}
		return triangular;
	}
	public static int maxnum(int m[][]) {
		int num= m[0][0];
		for(int fila=0; fila<m.length; fila++) {
			for (int col=0; col<fila; col++) {
				if (m[fila][col]>num)
					num=m[fila][col];
			}
			}
		return num;
	}
	public static int minnum(int m[][]) {
		int num= m[0][0];
		for(int fila=0; fila<m.length; fila++) {
			for (int col=0; col<fila; col++) {
				if (m[fila][col]<num)
					num=m[fila][col];
			}
			}
		return num;
	}
}
