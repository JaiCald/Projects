
import java.util.Arrays;

public class IntArray {

    // Private data fields
    private int length;
    private int myArray[];

    // Constructor creates an array
    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    // Returns the number of elements
    public int size() {
        return length;
    }

    // Fills the array with random numbers from 1 to 6
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // Returns an element from the array
    public int get(int element) {
        return myArray[element];
    }

    // Changes an element in the array
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Clears the array
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // Checks whether the array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns the array as a String
    public String toString() {
        return Arrays.toString(myArray);
    }
}

