package mainPackage;
import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {

		String str, inputType;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("> Inserisci una parola o frase: ");
		str = scn.nextLine().toLowerCase();
		
		if(str.contains(" ")) {
			inputType = "frase";
		}else {
			inputType = "parola";
		}
		
		if(IsPalindrome(str)) {
			System.out.println("\n- La " + inputType + " e' palindroma");
		}else{
			System.out.println("\n- La " + inputType + " non e' palindroma");
		}
		
		if(inputType == "frase"){
			int i;
          	String strNoSpaces = "";
			for(i=0; i<str.length(); i++) {
				if(str.charAt(i) != ' ') {
					strNoSpaces += str.charAt(i);
				}
			}
			if(IsPalindrome(strNoSpaces)) {
				System.out.println("- La frase e' palindroma eliminando gli spazi");
			}else {
				System.out.println("- La frase non e' palindroma eliminando gli spazi");		
			}
		}
		
	}
	
	public static boolean IsPalindrome(String str) {
		int i, checks = str.length()/2;
		
		for(i=0; i<checks; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	
}