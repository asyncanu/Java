// span of an array

import java.util.* ;
public class span{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter total array elements: ");
		int n = scn.nextInt();
        System.out.println("Total array elements: " + n );

        int[] arr = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt() ;
        }

        int max = arr[0] ;
        int min = arr[0] ;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i] ;
            }
            if(arr[i] < min){
                min = arr[i] ;
            }
        }
        int span = max - min ;
        System.out.println("Span of the array is: " + span) ;
    }
} 