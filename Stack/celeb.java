// Celebrity Problem - known by everybody, but knows nobody

import java.util.* ;
public class celeb{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the no of elements: ") ;
        int n = scn.nextInt() ;
        int[][] arr = new int[n][n] ;
        for(int i = 0; i < n; i++){
            String line = scn.next() ;
            for(int j = 0; j < n; j++){
                arr[i][j] = line.charAt(j) - '0' ;
            }
        }
        findCelebrity(arr) ;
    }

    public static void findCelebrity(int[][] arr){
        // if a celebrity is present, then print it's index (not position) 
        Stack <Integer> st = new Stack<>() ;
        for(int i = 0; i < arr.length; i++){
            st.push(i) ;
        }

        while(st.size() > 1){  
            int i = st.pop() ;
            int j = st.pop() ;
            if( arr[i][j] == 1){
                // if i knows j -> means i is not a celebrity, but j can be a celebrity
                st.push(j) ;
            } else{
                // if i does not know j -> means j is not a celebrity, but i can be a celebrity
                st.push(i) ;
            } 
        }

        int potc = st.pop() ; // potential celebrity
        for(int i = 0; i < arr.length; i++){
            if( (i != potc) && ( (arr[potc][i] != 0) || (arr[i][potc] != 1) ) ){
                System.out.println("no one is a celebrity") ;
                return;
            }
        }
        System.out.println("Celebrity index: " + potc);
    }
}