package mainpackage;

public class Methods{
	
	//INCREASE n
	public static double Inc(double n) {
		return ++n;
	}
	
	//DECREASE n
	public static double Dec(double n) {
		return --n;
	}
	
	//SUM 2 n
	public static double Sum(double add1, double add2) {
		boolean isPositive = IsPositive(add2);
		if(!isPositive) {
			add2 = Invert(add2);;
		}
		
		for(int i = 0; i < add2; i++) {
			if(isPositive) {
				add1 = Inc(add1);
			}else {
				add1 = Dec(add1);
			}
		}
		return add1;
	}
	
	//MULTIPLY op1 * op2
	public static double Multiply(double op1, double op2) {
		double prod = 0;
		boolean isPositive = IsPositive(op2);
		
		if(!isPositive) {
			op2 = Invert(op2);
		}
		
		for(int i = 0; i < op2; i++) {
			prod = Sum(prod, op1);
		}
		
		if(isPositive) {
			return prod;
		}else {
			return Invert(prod);
		}
	}
	
	//n POWER OF p
	public static double Pow(double n, int p) {
		double base = n;
		if(p == 0) {
			return 1;
		}else
		if(p > 0) {
			for(int i = 1; i < p; i++) {
				n = Multiply(n, base);
			}
			return n;
		}else{
			for(int i = 1; i < p; i++) {
				n = Multiply(n, 1/base);
			}
			return n;
		}
		
	}
	
	//CHANGE SIGN OF n
	public static double Invert(double n) {
		return n * (-1);
	}
	
	//RETURN SIGN FOR PRINT
	public static char GetSign(double n) {
		if(IsPositive(n)) {
			return '+';
		}else {
			return '-';
		}
	}
	
	//IS n POSITIVE
	public static boolean IsPositive(double n) {		
		if(n >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//GET ABSOLUTE VALUE OF n
	public static double GetAbsolute(double n) {
		if(!IsPositive(n)) {
			return Invert(n); 
		}else {
			return n;
		}
	}
	
	//RETURN n BETWEEN PARENTHESIS IF n<0
	public static String Parenthesis(double n) {
		if(IsPositive(n)) {
			return String.valueOf(n);
		}else {
			return "(" + n + ")";
		}
	}

}

