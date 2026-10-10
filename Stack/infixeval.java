// Infix Evaluation 

import java.util. * ;
public class infixeval{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the expression: ") ;
        String exp = scn.nextLine() ;

        Stack <Integer> operands = new Stack<>() ;
        Stack <Character> operators = new Stack<>() ;

        for(int i = 0 ; i < exp.length() ; i++){
            char ch = exp.charAt(i) ;

            if(ch == '('){
                operators.push(ch) ;

            } else if(Character.isDigit(ch)){       
                int num = 0 ;
                while(i < exp.length() && Character.isDigit(exp.charAt(i))){
                    num = num * 10 + (exp.charAt(i) - '0') ;                     // char to int convert 
                    i++ ;
                }
                i-- ;
                operands.push(num) ;

            } else if(ch == ')'){
                while(operators.peek() != '('){
                    char optor = operators.pop() ;
                    int v2 = operands.pop() ;
                    int v1 = operands.pop() ;

                    int opv = operation(v1, v2, optor) ;
                    operands.push(opv) ;
                }
                operators.pop() ;
                
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // ch wants higher precedence operators to solve first
                while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    char optor = operators.pop() ;
                    int v2 = operands.pop() ;
                    int v1 = operands.pop() ;

                    int opv = operation(v1, v2, optor) ;
                    operands.push(opv) ;
                }

                // ch is pushing itself now
                operators.push(ch) ;
            }
        }
        
        while(operators.size() != 0){
            char optor = operators.pop() ;
            int v2 = operands.pop() ;
            int v1 = operands.pop() ;

            int opv = operation(v1, v2, optor) ;
            operands.push(opv) ;
        }

        System.out.println("Result:" + operands.peek()) ;
    }

    public static int precedence(char operator){
        if(operator == '+'){
            return 1 ;
        } else if(operator == '-'){
            return 1 ;
        } else if(operator == '*'){
            return 2 ;
        } else if(operator == '/'){
            return 2 ;
        }
        return 0 ;
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