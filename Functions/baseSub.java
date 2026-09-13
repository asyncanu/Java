// Base Subtraction

import java.util.*;
public class baseSub
{
	public static int getDifference(int b, int n1, int n2){
        int rv = 0;
        int p = 1;
        int c = 0;

        while(n2 > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;   
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;

            if(d2 >= d1){
                c = 0;
                d = d2 - d1;
            } else{
                c = -1;
                d = d2 + 8 - d1;
            }
        
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

        int d = getDifference(b, n1, n2);
        System.out.println("Difference:" + d);
	}
}
