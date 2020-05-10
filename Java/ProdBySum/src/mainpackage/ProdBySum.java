package mainpackage;
import java.util.Scanner;

public class ProdBySum {

	public static void main(String[] args) {
		double op1, op2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("> Inserisci i 2 operandi: ");
		op1 = scn.nextDouble();
		op2 = scn.nextDouble();
		scn.close();
		
		System.out.println("\n[ " + op1 + " " + Methods.GetSign(op2) + " " + Methods.GetAbsolute(op2) + " = " + Methods.Sum(op1, op2) + " ]");
		System.out.println("[ " + op1 + " * " + Methods.Parenthesis(op2) + " = " + Methods.Multiply(op1, op2) + " ]");
		System.out.println("[ " + op1 + " ^ " + Methods.Parenthesis(op2) + " = " + Methods.Pow(op1, (int)op2) + " ] ");

		System.out.println((double)(int)op2 != op2 ? "(La potenza e' stata arrotondata per difetto)" : "");
		
	}
}

