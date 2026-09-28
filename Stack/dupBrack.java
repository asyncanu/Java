// Duplicate Brackets

import java.util.* ;
public class dupBrack{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the expression: ") ;
        String str = scn.nextLine() ;

        Stack <Character> st = new Stack<>() ;
        
        System.out.println("Duplicate Brackets: ") ;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ;

            if(ch == ')' ){
                if(st.peek() == '(' ){
                     System.out.println("true") ;
                     return ;
                } else{
                    while( st.peek() != '(' ){
                        st.pop() ;
                    }
                    st.pop() ;
                }
            } else{
                st.push( ch ) ;
            }
        }
        System.out.println("false") ;
    }
}

// (( a + b) + ( c + d )) -> FALSE
// ( a + b) + (( c + d )) -> TRUE