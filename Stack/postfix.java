// Postfix Evaluation & Conversion into Infix, Prefix

import java.util.* ;
public class postfix{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the expression: ") ;
        String exp = scn.nextLine() ;

        Stack <Integer> vals = new Stack <>() ;
        Stack <String> infix = new Stack <>() ;    
        Stack <String> prefix = new Stack <>() ;  

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i) ;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = vals.pop() ;
                int v1 = vals.pop() ;
                int val = operation(v1, v2, ch) ;
                vals.push(val) ;

                String inv2 = infix.pop() ;
                String inv1 = infix.pop() ;
                String inv = "(" + inv1 + ch + inv2 + ")" ;
                infix.push(inv) ;

                String pre2 = prefix.pop() ;
                String pre1 = prefix.pop() ;
                String prev = ch + pre1 + pre2 ;
                prefix.push(prev) ;

            } else{
                vals.push(ch - '0') ;
                infix.push(ch + " ") ;
                prefix.push(ch + " ") ;
            }
        }

        System.out.println("Value Stack: " + vals.pop()) ;
        System.out.println("Infix: " + infix.pop()) ;
        System.out.println("Prefix: " + prefix.pop()) ;
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