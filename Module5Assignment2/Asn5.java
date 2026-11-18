import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        // Create two ArrayLists
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add four items to the String ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Add four items to the Integer ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the original fruits
        System.out.println("Original Fruit List:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Display the original numbers
        System.out.println("\nOriginal Number List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Use set() to replace an item
        fruits.set(1, "Strawberry");
        numbers.set(1, 25);

        // Use remove() to delete an item
        fruits.remove(2);
        numbers.remove(2);

        // Display the updated fruits
        System.out.println("\nUpdated Fruit List:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Display the updated numbers
        System.out.println("\nUpdated Number List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

