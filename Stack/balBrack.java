// Balanced Brackets

import java.util.* ;
public class balBrack{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;

        System.out.println("Enter the expression: ") ;
        String str = scn.nextLine() ;

        Stack <Character> st = new Stack<>() ;
        
        System.out.println("Balanced Brackets: ") ;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ;

            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push(ch) ;
            } else if(ch == ')'){
                boolean val = handleClosing( st, '(' ) ;
                if(val == false){
                    System.out.println("false") ;
                    return ;
                }
            } else if(ch == '}'){
                boolean val = handleClosing( st, '{' ) ;
                if(val == false){
                    System.out.println("false") ;
                    return ;
                }
            } else if(ch == ']'){
                boolean val = handleClosing( st, '[' ) ;
                if(val == false){
                    System.out.println("false") ;
                    return ;
                }
            } 
        }

        if(st.size() == 0){
            System.out.println("true") ;
        } else{
            System.out.println("false") ;
        }
    }

    public static boolean handleClosing(Stack <Character> st, char corresoch){  // corresoch = corresponding opening character
        if(st.size() == 0){
            return false ;
        } else if(st.peek() != corresoch){
            return false ;
        } else{
            st.pop() ;
            return true ;
        }  
    }
}

// [ ( a + b) + { ( c + d ) * (e + f) } ] -> TRUE
// [ ( a + b) + { ( c + d ) * (e + f) ] } -> FALSE
// [ ( a + b) + { ( c + d ) * (e + f) } -> FALSE
// ( [ ( a + b) + { ( c + d ) * (e + f) } ] -> FALSE
