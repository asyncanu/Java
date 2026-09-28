// Largest Area Histogram

import java.io.* ;
import java.util.* ;
public class histogram{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine() ) ;

        int[] arr = new int[n] ;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine()) ;
        }
        
        int[] rb = new int[arr.length] ;   // next smaller element (nse) index on the right i.e. right boundary
        Stack <Integer> st1 = new Stack<>() ;

        st1.push(arr.length - 1) ;
        rb[arr.length - 1] = arr.length ;
        for(int i = arr.length - 2; i >= 0; i--){

            while(st1.size() > 0 && arr[i] <= arr[st1.peek()]){
                st1.pop() ;
            }

            if(st1.size() == 0){
                rb[i] = arr.length ;
            } else{
                rb[i] = st1.peek() ;
            }
            st1.push(i) ;
        }

        int[] lb = new int[arr.length] ;   // next smaller element (nse) index on the left i.e. left boundary
        Stack <Integer> st2 = new Stack<>() ;

        st2.push(0) ;
        lb[0] = -1 ;
        for(int i = 1; i < arr.length; i++){

            while(st2.size() > 0 && arr[i] <= arr[st2.peek()]){
                st2.pop() ;
            }

            if(st2.size() == 0){
                lb[i] = -1 ;
            } else{
                lb[i] = st2.peek() ;
            }
            st2.push(i) ;
        } 

        int maxArea = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int width = rb[i] - lb[i] - 1 ;
            int area = arr[i] * width ;
            if(area > maxArea){
                maxArea = area ;
            }
        }
        System.out.println("Max Area of Histogram: " + maxArea) ;
    }
}