public class variableExample {
    //Instance variable 
    int instancevariable = 100;
    //instancevariable can only be accessed with the object 
    //Static variable 
    static boolean staticvariable = false;
    //static variable can be accessed with class directly 

    void firstfunction(){
        int localvariable = 300;
        //Local variable are made insede a function/constructor scope/block 
        System.out.println("local variable:" + localvariable);
    }
    public static void main(String[] args) {
        int localvariable2 = 400;
        System.out.println("Local variable : " + localvariable2);
        //To use the instance variable of a class, make object
        //Syntax: className objvariable = new ClassName();
        variableExample variableExampleObj = new variableExample();
        //The variable of variableExample is called object, here variableExampleObj
        System.out.println("Instance variable: " + variableExampleObj.instancevariable);
        //static variable can be accessed with, ClassName.variableName
        System.out.println("static variable : " + variableExample.staticvariable);

        //java TypeCasting primitive DataType
        //Widening Casting/Implicit Casting/ automatic
        //byte-> short-> char-> int-> Long-> float-> double
        byte bytevariable = 10;
        short shortvariable = bytevariable; //here byte is automatically converted to short

        int mathMark = 20;
        double mathConverted = mathMark; //int is automatically converyed to double -> 20.0
        System.out.println("Int to double " + mathConverted);

        //Narrowing Casting/Explicit Casting/ Manual
        // conversion of larger datatype to smaller dataType
        double gpa = 3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int " + gpaInt);
        int floatConversion = (int ) 400.33f; // 400

        //Calculation 
        float mathCalc = 1/2; // 1/2 in int is 0-> 0.0
        System.out.println(mathCalc);
        float mathCalcSolve = 1.0f/2; //either one value float
        float mathCalcSolve2 = (float) 1/2; // or manual cast
    }
}
 
/*
 * Task
 * Make an instrance variable firstName
 * Make a new object and print the firstName
 * Calculate and print the following 
 * double avg = 13/2
 * float pct = 411/100
 */