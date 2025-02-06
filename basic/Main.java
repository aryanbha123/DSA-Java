class Example {
    int value;

    // Parameterized Constructor
    Example(int value) {
        this.value = value;
    }

    // Copy Constructor
    Example(Example obj) {
        this.value = obj.value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example(42);  // Create the original object
        Example obj2 = new Example(obj1); // Create a copy using the copy constructor

        obj1.display();
        obj2.display();
    }
}
