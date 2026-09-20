// difference of two arrays

import java.util.* ;
public class arrayDiff{

    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);

        System.out.println("Enter total array 1 elements: ");
		int n1 = scn.nextInt();
        System.out.println("Total array 1 elements: " + n1 );

        int[] a1 = new int[n1] ;
        System.out.println("Enter array 1 elements: ");
        for(int i = 0; i < a1.length; i++){
            a1[i] = scn.nextInt() ;
        }

        System.out.println("Enter total array 2 elements: ");
		int n2 = scn.nextInt();
        System.out.println("Total array 2 elements: " + n2 );

        int[] a2 = new int[n2] ;
        System.out.println("Enter array 2 elements: ");
        for(int i = 0; i < a2.length; i++){
            a2[i] = scn.nextInt() ;
        }

       int[] diff = new int[n2] ;
       int c = 0 ;
       int i = a1.length - 1 ;
       int j = a2.length - 1 ;
       int k = diff.length - 1 ;

       while(k >= 0){
        int d = 0 ;
        int a1v = (i >= 0) ? a1[i] : 0 ;

        if(a2[j] + c >= a1v){
            d = a2[j] + c - a1v ;
            c = 0 ;
        } else{
            d = a2[j] + c + 10 - a1v ;
            c = -1 ;
        } 

        diff[k] = d ;
        i-- ;
        j-- ;
        k-- ;
       }

       int idx = 0 ;
       while(idx < diff.length){
        if(diff[idx] == 0){
            idx++ ;
        } else{
            break ;
        }
       }

       System.out.print("Difference: ") ;
       while(idx < diff.length){
        System.out.print(diff[idx]) ;
        idx++ ;
       }
    }
} 