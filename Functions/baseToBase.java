// Any base to base

import java.util.*;
public class baseToBase
{
	public static int getValue(int n, int b1, int b2){
        int dec = baseToDecimal(n, b1);
        int dsn = decimalToBase(dec, b2);
        return dsn;
    }
    
    public static int baseToDecimal(int n, int b){
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

    public static int decimalToBase(int n, int b){
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
		
		System.out.println("Enter the current base: ");
		int b1 = scn.nextInt();
		System.out.println("current base: " + b1);

        System.out.println("Enter the new base: ");
		int b2 = scn.nextInt();
		System.out.println("new base: " + b2);

        int d = getValue(n, b1, b2);
        System.out.println(d);
	}
}