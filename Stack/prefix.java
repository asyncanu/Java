// Prefix Evaluation & Conversion into Infix, Postfix

import java.util.* ;
public class prefix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the expression: ") ;
        String exp = scn.nextLine() ;

        Stack <Integer> vals = new Stack <>() ;      // value stack
        Stack <String> infix = new Stack <>() ;    
        Stack <String> postfix = new Stack <>() ;  

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i) ;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v1 = vals.pop() ;
                int v2 = vals.pop() ;
                int val = operation(v1, v2, ch) ;
                vals.push(val) ;

                String inv1 = infix.pop() ;
                String inv2 = infix.pop() ;
                String infv = "(" + inv1 + ch + inv2 + ")" ;
                infix.push(infv) ; 

                String post1 = postfix.pop() ;
                String post2 = postfix.pop() ;
                String postv = post1 + post2 + ch ;
                postfix.push(postv) ;

            } else{
                vals.push(ch - '0') ;
                infix.push(ch + " ") ;
                postfix.push(ch + " ") ;
            }
        }

        System.out.println("Value Stack: " + vals.pop()) ;
        System.out.println("Infix: " + infix.pop()) ;
        System.out.println("Postfix: " + postfix.pop()) ;
    }

    public static int operation(int v1, int v2, char operator){
        if(operator == '+'){
            return v1 + v2 ;
        } else if(operator == '-'){
            return v1 - v2 ;
        } else if(operator == '*'){
            return v1 * v2 ;
        } else if(operator == '/'){
            return v1 / v2 ;
        }
        return 0 ;
    }
}