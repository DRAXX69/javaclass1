public class operatorClass {
    public static void main(String[] args) {
        //Arthimetic Operator
        //+,-,*,/,%
        int intVar1 = 10, intVar2 = 20;
        int addOper = intVar1 + intVar2; // 10+ 20
        int minusOper = intVar1 - intVar2; // 10-20
        int multOper = intVar1 * intVar2; // 10*20
        int divOper = intVar1 % intVar2; // 10/20 (remainder)

        //Assignment operator 
        int assignVar = 10;
        assignVar += 20; // 10+20-> 30
        assignVar -= 15; // 30-15-> 15
        assignVar *= 2; // 15*2 -> 30
        assignVar /= 10; // 30/10-> 3
        assignVar %= 2; //3%2-> 1

        //Unary Operator
        int unaryVar = 20;
        unaryVar ++; // unaryVar +=1; 20+1;21
        unaryVar --; // unaryVar -=1; 21-1;20

        //Relational Operator
        int relVar1 = 20, relVar2 = 30;
        boolean equalOper = relVar1 == relVar2; // 20=30? false
        boolean greaterOper = relVar1> relVar2; // 20>30 ? false
        boolean lessEqualOper = relVar2 <= 30; // 30<= 30? false
        boolean notEqual = 20 !=10; // true

        //Logical Operator
        int LogVar1 = 10, LogVar2 = 20, LogVar3 = 23;
        boolean andOper = true && true;
        boolean andOperVar = (LogVar1<LogVar2) && (LogVar3==LogVar2); // true && false
        boolean orOper = false || false || true;
        boolean orOperVar = (LogVar1<LogVar2) || (LogVar3==LogVar2);
        boolean notOper =! (LogVar1<LogVar2); // !true->false

        //Ternary Operator
        /*
         * String status;
         * int marking = 40;
         * if(marking>49){
         * status = "pass";
         * }else{
         * status = "fail";
         * }
         */
        int marking = 40;
        String status = (marking> 40 ) ? "pass": "fail";
        System.out.println("Status : " + status);

        

    }
    
}
