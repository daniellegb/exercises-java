package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				System.out.printf(mat[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i<mat.length; i++) {
			System.out.printf(mat[i][i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("Negative numbers: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]<0) {
					System.out.printf(mat[i][j] + " ");
				}
			}
		}
		
		sc.close();
	}

}
