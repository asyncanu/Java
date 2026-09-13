// Base Addition

import java.util.*;
public class baseAddition
{
	public static int getSum(int b, int n1, int n2){
        int rv = 0;
        int p = 1;
        int c = 0;

        while(n1 > 0 || n2 > 0 || c > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv = rv + (d * p);
            p = p * 10;
        }
        return rv;
    }
    

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter the base: ");
		int b = scn.nextInt();
		System.out.println("base: " + b);

		System.out.println("Enter no 1: ");
		int n1 = scn.nextInt();
		System.out.println("number 1: " + n1);
		
		System.out.println("Enter no 2: ");
		int n2 = scn.nextInt();
		System.out.println("number 2: " + n2);

        int d = getSum(b, n1, n2);
        System.out.println(d);
	}
}
