// Build Normal Queue

import java.util.* ;
public class queue{
    public static class CustomQueue{
        int[] data ;
        int front ;
        int size ;

        public CustomQueue(int cap){
            data = new int[cap] ;
            front = 0 ;
            size = 0 ;
        }

        int size(){
            return size ;
        }
        
        void display(){
            for(int i = 0 ; i < size ; i++){
                int idx = (front + i) % data.length ;
                System.out.print(data[idx] + " ") ;
            }
            System.out.println() ;
        }

        void add(int val){
        // for normal queue
            if(size == data.length){
                System.out.println("queue overflow") ;
            } else{
                int rear = (front + size) % data.length ;
                data[rear] = val ;
                size++ ;
            }

        // for dynamic queue
            if(size == data.length){
                int[] ndata = new int[2 * data.length] ;
                for(int i = 0; i < size; i++){
                    int idx = (front + i) % data.length ;
                    ndata[i] = data[idx] ;
                }
                data = ndata ;
                front = 0 ;
                int idx = (front + size) % data.length ;
                data[idx] = val ;
            } else{
                int idx = (front + size) % data.length ;
                data[idx] = val ;
                size++ ;
            }
        }

        int remove(){
            if(size == 0){
                System.out.println("queue underflow") ;
                return -1 ;
            } else{
                int val = data[front] ;
                front = (front + 1) % data.length ;
                size-- ;
                return val ;
            }
        }

        int peek(){
            if(size == 0){
                System.out.println("queue underflow") ;
                return -1 ;
            } else{
                return data[front] ;
            }
        }

    }

    public static void main(String[] args){
        Queue<Integer> que = new ArrayDequeue<>() ;

    }
}