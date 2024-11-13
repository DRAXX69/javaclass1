/*
 * Task
 * Make an instrance variable firstName
 * Make a new object and print the firstName
 * Calculate and print the following 
 * double avg = 13/2
 * float pct = 411/100
 */

 public class task3 {

    // Instance variable
    String firstName;

    // Constructor to initialize firstName
    public task3(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        // Create a new object of Student class and print the firstName
        task3 student = new task3("John");
        System.out.println("First Name: " + student.firstName);

        // Calculate and print the average
        double avg = 13.0 / 2;
        System.out.println("Average (13/2): " + avg);

        // Calculate and print the percentage
        float pct = 411.0f / 100;
        System.out.println("Percentage (411/100): " + pct);
    }
}