package mainpackage;
import java.util.Scanner;
public class ProdBySum {

	public static void main(String[] args) {
		int op1, op2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("> Inserisci i 2 operandi della moltiplicazione: ");
		op1 = scn.nextInt();
		System.out.print(" * ");
		op2 = scn.nextInt();
		System.out.print(" = " + Multiply(op1, op2));
		
	}
	
	static int Sum(int add1, int add2) {
		return add1 + add2;
	}
	
	static int Multiply(int op1, int op2) {
		int prod = 0;
		boolean isPositive = IsPositive(op2);
		if(!isPositive) {
			op2 *= -1;
		}
		
		for(int i = 0; i < op2; i++) {
			prod = Sum(prod, op1);
		}
		
		if(isPositive) {
			return prod;
		}else {
			return (-1) * prod;
		}
	}
	
	static boolean IsPositive(int n) {		
		if(n >= 0) {
			return true;
		}else {
			return false;
		}
	}

}
