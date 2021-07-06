import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the line number: ");
		int x = sc.nextInt();
		System.out.println("Enter the columns number: ");
		int y = sc.nextInt();
		
		int[][] matrix = new int[x][y];
		
		System.out.println("Enter the matrix numbers: ");
		for(int i = 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the number to be found: ");		
		int number = sc.nextInt();
		
		for(int i = 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(matrix[i][j] == number) {
					System.out.println("Position: " + i + "," + j);
					
					if(j > 0) System.out.println("Left: " + matrix[i][j-1]);
					if(j+1 < y) System.out.println("Right: " + matrix[i][j+1]);
					if(i > 0) System.out.println("Up: " + matrix[i-1][j]);
					if(i+1 < x) System.out.println("Down: " +  matrix[i+1][j]);					
				}
			}
		}
		
		sc.close();

	}

}
