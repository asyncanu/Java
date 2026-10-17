public class clobj{

    public static class Person{
        int age ;
        String name ;
        void saysHi(){
            System.out.println(name + "[" + age + "] says Hi") ;
        }

        // if we forget, java provides our class a default constructor      
        Person(){
            // constructor
        }

        // parameterized constructor
        Person(int age, String name){
            this.age = age ;
            this.name = name ;
        }
    }
    public static void main(String[] args){
        Person p1 = new Person() ;
        p1.age = 10 ;
        p1.name = "A" ;
        p1.saysHi ;       // A[10] says Hi

        Person p2 = new Person() ;
        p2.age = 20 ;
        p2.name = "B" ;
        p2.saysHi ;       // B[20] says Hi

        Person p3 = p1 ;
        p3.age = 30 ;
        p3.saysHi ;       // A[30] says Hi
        p1.saysHi ;       // A[30] says Hi

    // Swap 1 
        p1.saysHi ; 
        p2.saysHi ; 
        swap1(p1, p2) ;
        p1.saysHi ; 
        p2.saysHi ; 
    }

    Person p4 = new Person(40, "C") ;
    p4.saysHi ;

    public static void swap1(Person psn1, Person psn2 ){
        Person temp = psn1 ;
        psn1 = psn2 ;
        psn2 = temp ;

        int age = psn1.age ;
        psn1.age = psn2.age ;
        psn2.age = age ;

        String name = psn1.name ;
        psn1.name = psn2.name ;
        psn2.name = name ;


    }
}