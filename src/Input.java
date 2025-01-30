//import scanner
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get user name
        System.out.print("Enter your name: ");
        String name;
        name = scanner.nextLine();
        //get user age
        System.out.print("Enter your age: ");
        int age;
        age = scanner.nextInt();
        //get user weight
        System.out.print("Enter your weight: ");
        float weight;
        weight = scanner.nextFloat();
        //ask if user is a smoker t/f
        System.out.print("You are a smoker (true/false): ");
        boolean isSmoker;
        isSmoker = scanner.nextBoolean();
        //output user info
        System.out.print(name + ", " + age + "yrs old, " + weight + "lbs, " + "Smoker: " + isSmoker + ". ");
    }
}
