import java.util.Scanner;
//Importing scanner in order to reciever user input

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2.toString());

        Pet pet3 = new Pet();

        System.out.println("Enter animal type:");
        pet3.setType(input.nextLine());

        System.out.println("Enter animal name: ");
        pet3.setName(input.nextLine());

        System.out.println("Enter animal age:");
        pet3.setAge(input.nextInt());

        System.out.println(pet3.toString());

    }

}
