public class userOutput {
    public static void main(String[] args) {
        //Standard output/ terminal output
        // Continuous printing
        System.out.print("This");
        System.out.print("is");
        System.out.print("Java\n");

        //Line break after printing
        System.out.println("Next print will start from next line");

        //Print using formating
        //%f floating point, % integral, %s string(any)
        System.out.printf("Temperature %f degree celsius",30.22);
        //Can use multiple placeholder
        System.out.printf("Name %s, Age %d, Weight %f","mero nam", 30,75,44);
        //The arrangement of the placeholder and value given after string must match
        //eg: 1 %s string %d integer, # %f float


    }
    
}
