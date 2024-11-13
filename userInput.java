import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        //To take input import scanner class at the top of the file 
        // Import java.util.scanner;
        //Make an object of the scanner and take input from object
        Scanner scan = new Scanner(System.in);
        System.out.println("Your age: ");
        int ageInput = scan.nextInt();
        System.out.println("Your are " + ageInput);

        System.out.println("over 18?");
        boolean over18Input = scan.nextBoolean();

        System.out.println("You weignt ");
        double WeightInput = scan.nextDouble();

        // After using scanner fro primitive data and want input for string 
        //you need to clear the enter input 
        scan.nextLine();
        System.out.println("you name? ");
        String name = scan.nextLine();
        scan.close(); //must close scanner object to avoid input locks
    }
    
}
