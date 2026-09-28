// Next Greater Element on the right

import java.util.* ;
public class nextGel{

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder() ;
        for(int val: a){
            sb.append(val + "\n") ;
        }
        System.out.println(sb) ;
    }

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine() ) ;
        int[] arr = new int[n] ;
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine()) ;
        }
        int[] nge = solve(arr) ;
        display(nge) ;
    }
    
    public static int[] solve(int[] arr){
        int[] nge = new int[arr.length]  ;
        Stack <Integer> st = new Stack<>() ;

        st.push(arr[arr.length - 1]) ;
        nge[arr.length - 1] = -1 ;

        for(int i = arr.length - 2 ; i >= 0; i--){
            // - a + 
            while(st.size() > 0 && arr[i] >= st.peek() ){
                st.pop() ;
            }

            if(st.size() == 0){
                nge[i] = -1 ;
            } else{
                nge[i] = st.peek() ;
            }

            st.push(arr[i]) ;
        }
        return nge ;
    }
    // OR
    public static int[] solve(int[] arr){
        int[] nge = new int[arr.length]  ;
        Stack <Integer> st = new Stack<>() ;

        st.push(0) ;
        for(int i = 1; i < arr.length; i++){
            // - a + 
            while(st.size() > 0 && arr[i] >= arr[st.peek()] ){
                int pos = st.peek() ;
                nge[pos] = arr[i] ;
                st.pop() ;
            }
            st.push(i) ;
        }
        while(st.size() > 0){
            int pos = st.peek() ;
            nge[pos] = -1 ;
            st.pop() ;
        }
        return nge ;
    }
}
