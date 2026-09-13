//Base to Decimal

import java.util.*;
public class baseToDecimal
{
	public static int getValueInDecimal(int n, int b){
        int rv = 0;
        int p = 1;

		while(n > 0){
			int dig = n % 10;
			n = n/10 ;
			rv = rv + (dig * p);
			p = p * b;
		}
		return rv;
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the no: ");
		int n = scn.nextInt();
		System.out.println("number: " + n);
		
		System.out.println("Enter the current base: ");
		int b = scn.nextInt();
		System.out.println("current base: " + b);
		
        int bd = getValueInDecimal(n, b);
		System.out.println("Number in base 10 = " + bd);
	}
}
