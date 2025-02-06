package learning;

// 4 principals of OOPS
// 1. Encapsulation -> defining funcation properties/datatype & methods/function
// 2. Abstraction -> Hiding underlying complexities example: while drving a car 
// 3. Inheritance -> jb koi child class apni parent class koi bhi propert /method./ funcationality legi  
// 4. Polymorphism -> ek jaise do function , function with same appearamce performing diffrent operations


// access modifiers 
// 1. Public :  kahi bhi kabhi bhi use krlo
// 2. Private : accessible withing the class only
// 3. Protected : accessible only in the file not in another file
// encapsulation

class Encapsulation {
    public int a;
    private int b; // properities


    // constructor : special function jo ki tb apne aap call hoga jb tu object banaegi
    Encapsulation(){
        System.out.println("C -1 is called");
    }
    Encapsulation(int a){
        this.a = a;
        System.out.println("C -2 is called");
    }
    Encapsulation(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("C -3 is called");
    }

    // getter function : taki
    void get() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    // update setter function
    void set(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Abstraction{
    int arr[];
    int n;
    void size(){
        System.out.println("Size of array is: "+ this.arr.length);
    }
}
public class Principle {
    public static void main(String[] args) {
        Encapsulation ec1 = new Encapsulation();
        Encapsulation ec2 = new Encapsulation(1);
        Encapsulation ec3 = new Encapsulation(1, 2);
        // System.out.println(ec.a);
        // ec.a = 10;
        // ec.b = 0;
        // System.out.println(ec.b);
        // ec.get();
        // ec.set(1, 3);
        // ec.get();
        Abstraction ab = new Abstraction(); // object banaya
        ab.arr = new int[10];
        // ab.arr.n;
        // Abstraction ek concept jis se tum user ko minimum effort krvaoge , underlying complexity hogi vo reduce krege ya fir hide krege
        System.out.println(ab.arr.length);
        ab.size();
    }

}
