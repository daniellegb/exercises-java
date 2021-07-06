
public class StringsInteressantes {

	public static void main(String[] args) {
		//Formatar: toLowerCase(), toUpperCase(), trim()
		//Recortar: substring(inicio, substring(inicio,fim)
		//Substituir: Replace(char,char), Replace(string, string)
		//Buscar: IndexOf, LastIndexOf
		//str.Split("")
		
		String original = "abcde FGHIJ ABC abc DEFG     ";

		String s01 = original.toLowerCase();
		System.out.println("Original: " + original + ".");
		System.out.println("toLowerCase: " + s01 + ".");

		String s02 = original.toUpperCase();
		System.out.println("Original: " + original + ".");
		System.out.println("toUpperCase: " + s02 + ".");
		
		String s03 = original.trim();
		System.out.println("Original: " + original + ".");
		System.out.println("Trim: " + s03 + ".");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
