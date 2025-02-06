package learning;

// helper class
class Triangle{
    int side1; // base
    int side2; // height
    int side3; // perpendicular

    // constructor : is a function which is automatically invoked when we create a object .
    Triangle(){
        System.out.println("Constructor called");
    }
    public void area(int side1){
        System.out.println(side1);
        System.out.println(this.side1); // this 
    }
}


// main class jaha se sb shurur hoga  : is class k bina kuch ni chlega
public class Assignment2 {

    // jb bhi code run hoga this one will be the first function which will run similar to int main() in c lang
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();  // hamne ek object bnaya xyz class  , Triangle:Class & t1 is object /instance of class
        // Triangle t2 = new Triangle();  // hamne ek object bnaya xyz class  , Triangle:Class & t1 is object /instance of class

        // t1.side1 = 3;
        // // t1.side2 = 4;
        // // t1.side3 = 5;
        // // t2.side1 = 4;
        // // t2.side2 = 5;
        // // t2.side3 = 6;
        // t1.area(1);
        // ["1" , "3"]

        // for(int i = 0 ; i < args.length ; i++){
        //     System.out.println(args[i]);
        // }

    }
}