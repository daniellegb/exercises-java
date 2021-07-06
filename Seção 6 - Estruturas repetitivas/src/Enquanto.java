import java.util.Scanner;
import java.util.Locale;


public class Enquanto {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		
		while(x!=0) {
			System.out.println(x);
			x = sc.nextInt();
		}
		
		System.out.println("Acabou =)");
		
		sc.close();
		
	}
}
