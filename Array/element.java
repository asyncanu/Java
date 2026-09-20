// find element in an array

import java.util.* ;
public class element{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter total array elements: ");
		int n = scn.nextInt();
        System.out.println("Total array elements: " + n );

        int[] arr = new int[n] ;
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt() ;
        }

        System.out.println("Enter the element to search for: ");
		int d = scn.nextInt();

        int idx = -1 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                idx = i ;
                break ;
            }
        }
        
        System.out.println("Index of " + d + " = " + idx) ;
    }
} 