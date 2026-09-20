// find element in an array

import java.util.* ;
public class barChart{

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

        int max = arr[0] ;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i] ;
            }
        }

        System.out.println("Bar Chart: ");
        for(int floor = max; floor >= 1; floor--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t") ;
                } else {
                    System.out.print("\t") ;
                }
            }
            System.out.println() ;
        }
    }    
} 