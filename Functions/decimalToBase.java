//Decimal to Base

import java.util.*;
public class decimalToBase
{
	public static int getValueInBase(int n, int b){
        int rv = 0;
        int p = 1;

		while(n > 0){
			int dig = n % b;
			n = n/b ;
			rv = rv + (dig * p);
			p = p * 10;
		}
		return rv;
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the no: ");
		int n = scn.nextInt();
		System.out.println("number: " + n);
		
		System.out.println("Enter the base: ");
		int b = scn.nextInt();
		System.out.println("base: " + b);
		
		System.out.println("converted no: ");
        int db = getValueInBase(n, b);
		System.out.println("Number in base " + b + " = " + db);
	}
}