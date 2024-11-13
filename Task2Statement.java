public class Task2Statement {
    public static void main(String[] args) {
        int avgMark = 85; // Assign a value to avgMark
        char gender = 'M'; // Assign a value to gender

        if (avgMark > 80 && gender == 'M') {
            System.out.println("Good boy");
        } else if (avgMark > 80 && gender == 'F') {
            System.out.println("Good girl");
        } else if (avgMark <= 80 && gender == 'M') {
            System.out.println("Bad boy");
        } else if (avgMark <= 80 && gender == 'F') {
            System.out.println("Bad girl");
        }
    }
}