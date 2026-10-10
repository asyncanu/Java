// Infix Conversions

import java.util.* ;
public class infixcon{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the expression: ") ;
        String exp = scn.nextLine() ;

        Stack <Character> operators = new Stack <>() ;
        Stack <String> postfix = new Stack <>() ;    
        Stack <String> prefix = new Stack <>() ;  
        
        for(int i = 0 ; i < exp.length(); i++){
            char ch = exp.charAt(i) ;

            if(ch == '('){
                operators.push(ch) ;

            } else if( (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
                postfix.push(ch + " ") ;
                prefix.push(ch + " ") ;

            } else if(ch == ')'){
                while(operators.peek() != '('){
                    process(operators, postfix, prefix) ;
                }
                operators.pop() ; // popping opening bracket (

            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                   process(operators, postfix, prefix) ;
                }
                operators.push(ch) ; // pushing current operator 
            }
        }

        while(operators.size() > 0){
            process(operators, postfix, prefix) ;
        }

        System.out.println("Postfix: " + postfix.pop()) ;
        System.out.println("Prefix: " + prefix.pop()) ;
    }

    public static void process(Stack <Character> operators, Stack <String> postfix, Stack <String> prefix){
        char optor = operators.pop() ;
        String postv2 = postfix.pop() ;
        String postv1 = postfix.pop() ;
        String postv = postv1 + postv2 + optor ;
        postfix.push(postv) ;

        String prev2 = prefix.pop() ;
        String prev1 = prefix.pop() ;
        String prev = optor + prev1 + prev2 ;
        prefix.push(prev) ;
    
    }

    public static int precedence(char operator){
        if(operator == '+' || operator == '-'){
            return 1 ;
        } else if(operator == '*' || operator == '/'){
            return 2 ;
        } else{
            return 0 ;
        }
    }
}