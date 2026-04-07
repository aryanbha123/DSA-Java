import java.util.ArrayList;

class MyArray {
    int[] array;

    // Constructor
    MyArray(int size) {
        array = new int[size];
    }

    // Insert value at index
    void insert(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Display array
    void display() {
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Static method
    public static void showMessage(String msg) {
        System.out.println(msg);
    }
}

public class One {
    public static void main(String[] args) {

        // Object of MyArray
        MyArray a1 = new MyArray(5);

        // Insert values
        a1.insert(0, 10);
        a1.insert(1, 20);
        a1.insert(2, 30);

        // Display array
        a1.display();

        // ArrayList usage
        ArrayList<Integer> aryan = new ArrayList<>();
        aryan.add(100);
        aryan.add(200);

        System.out.println("ArrayList: " + aryan);

        // Static method call
        MyArray.showMessage("Aryan");
    }
}
