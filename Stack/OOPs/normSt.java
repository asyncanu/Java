// Normal Stack

public class normst{

    public static class customStack{
        int[] data ;
        int tos ; // top of stack

        public customStack(int cap){
            data = new int[cap] ;  // capacity of stack
            tos = -1 ;
        }

        int size(){
            return tos + 1 ;
        }

        void display(){
            for(int i = tos; i >= 0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val){
            if(tos == data.length -1){
                System.out.println("Stack overflow") ;

                // dynamic stack changes
                if(tos == data.length -1){
                    int[] ndata = new int[2 * data.length] ;
                    for(int i = 0; i <  data.length; i++){
                        ndata[i] = data[i] ;
                    }
                    data = ndata ;
                    tos++ ;
                    data[tos] = val ;
                }
            } else{
                tos++ ;
                data[tos] = val ;
            }
        }

        int pop(){
            if(tos == -1){
                System.out.println("Stack underflow") ;
                return -1 ;
            } else{
                int val = data[tos] ;
                tos-- ;
                return val ;
            }
        }

        int top(){
            if(tos == -1){
                System.out.println("Stack underflow") ;
                return -1 ;
            } else{
                return data[tos] ;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total elements: ");
		int n = scn.nextInt();
        customStack st = new customStack(n) ;
    }
}