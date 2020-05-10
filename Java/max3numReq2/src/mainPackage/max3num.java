package mainPackage;
import java.util.Scanner;
public class max3num {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("> Immetti 3 numeri:");
		System.out.print("- ");
		n1 = scn.nextInt();
		System.out.print("- ");
		n2 = scn.nextInt();
		System.out.print("- ");
		n3 = scn.nextInt();
		
		System.out.println("\n> Il numero piu' grande e' " + Max3(n1, n2, n3));
	}
	
	static int Max3(int n1, int n2, int n3) {
		return Max2(n1, Max2(n2, n3));
	}

	static int Max2(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}else {
			return n2;
		}
	}
}
