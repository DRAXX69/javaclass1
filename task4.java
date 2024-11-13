/*
 * Task 
 * Add the following variable 
 * oopMarking -> int
 * architectureMarking -> int
 * databaseMarking -> int
 * creativeThinking -> int
 * make a float avg and calculate the avg of the markings 
 * make a boolean expression to check if
 * all the marking is greater of equal to 40
 * and check if the avg greater than 50
 * Make a result -> string and check the boolean
 * if true set result as "Good job" else set result as "Bad job"
 * print tyhe result 
 */

 public class task4 {

    public static void main(String[] args) {
        // Define the marks
        int oopMarking = 75;
        int architectureMarking = 65;
        int databaseMarking = 80;
        int creativeThinking = 55;

        // Calculate the average
        float avg = (oopMarking + architectureMarking + databaseMarking + creativeThinking) / 4.0f;

        // Boolean expression to check if all marks >= 40 and avg > 50
        boolean allMarksAbove40 = (oopMarking >= 40 && architectureMarking >= 40 && databaseMarking >= 40 && creativeThinking >= 40);
        boolean avgAbove50 = avg > 50;

        // Determine result
        String result;
        if (allMarksAbove40 && avgAbove50) {
            result = "Good job";
        } else {
            result = "Bad job";
        }

        // Print the result
        System.out.println(result);
    }
}
