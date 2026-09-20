// sum of two arrays

import java.util.* ;
public class arraySum{

    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);

        System.out.println("Enter total array 1 elements: ");
		int n1 = scn.nextInt();
        System.out.println("Total array 1 elements: " + n1 );

        int[] arr1 = new int[n1] ;
        System.out.println("Enter array 1 elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt() ;
        }

        System.out.println("Enter total array 2 elements: ");
		int n2 = scn.nextInt();
        System.out.println("Total array 2 elements: " + n2 );

        int[] arr2 = new int[n2] ;
        System.out.println("Enter array 2 elements: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scn.nextInt() ;
        }

       int[] sum = new int[n1 > n2 ? n1 : n2] ;
       int c = 0 ;
       int i = arr1.length - 1 ;
       int j = arr2.length - 1 ;
       int k = sum.length - 1 ;

       while(k >= 0){
        int d = c ;

        if(i >= 0){
            d += arr1[i] ;
        } 

        if(j >= 0){
            d += arr2[j] ;
        } 

        c = d / 10 ;
        d = d % 10 ;
        sum[k] = d ;

        i-- ;
        j-- ;
        k-- ;
       }

       System.out.print("Sum: ") ;

        if(c != 0){
            System.out.print(c) ;
        }

        for(int val : sum){
            System.out.print(val) ;
        }
    }
} 