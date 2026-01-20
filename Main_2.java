import java.util.Scanner;


public class Main_2 {
    public static void main(String[] args){
        
        //OPERATORS --> WE HAVE 4 OPERATORS IN JAVA
        // a. Arithmatic operators
//        ‘+’ Add
//        int a = 30;
//        int b = 40;
//        int sum = a + b;
//        System.out.println(sum);

//        2. ‘-’ Subtract
//        int c = 30;
//        int d = 40;
//        int diff = c - d;
//        System.out.println(diff);

//        3. ‘*’ Multiply
//        int e = 30;
//        int f = 40;
//        int mul = e * f;
//        System.out.println(mul);

//        4. ‘/’ Divide
//        int g = 30;
//        int h = 40;
//        int div = g / h;
//        System.out.println(div);
//        5. ‘%’ Modulo - Remainder of a/b
//        int i = 30;
//        int j = 40;
//        int modulo = i % j;
//        System.out.println(modulo);

//        6. Unary Operators
        // incrementer
//        Post-incrementer : It stores the current value of the operand
//        temporarily  and only after that statement is completed, the value
//        of the operand is  incremented.
//        int a = 1;
//        System.out.println(a++); // after ++ means post and (a++ --> a = a+1) , 1
//        System.out.println(a);  // 2
//
//        // Pre-incrementer : It increments the value of the operand instantly.
//        int b = 1;
//        System.out.println(++b); // before ++ means pre and  , 2
//        System.out.println(a); // 2

        // Decrementer
//        Post-decrementer : It stores the current value of the operand
//        temporarily  and only after that statement is completed, the value
//        of the operand is  decremented.
//        int a = 2;
//        System.out.println(a--); // after -- means post and (a++ --> a = a+1) , 2
//        System.out.println(a);  // 1

        // Pre-decrementer : It decrements the value of the operand instantly.
//        int b = 2;
//        System.out.println(--b); // before -- means pre and  , 1
//        System.out.println(a); // 1

       // Math class
//        System.out.println(Math.max(5,6)); // find max value
//        System.out.println(Math.min(5,6));  // find min value
//        System.out.println((int)(Math.random()*100)); // show random values

       // How to take input?

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter your name: ");
//        String name1 = sc.next(); // it does not take a sentence only take toke of word.
//
//        System.out.print("Enter your number: ");
//        float num = sc.nextFloat();
//
//        sc.nextLine(); // *** FIX: Consume the leftover newline from sc.nextFloat() ***
//        System.out.print("Tell us about yourself: ");
//        String name2 = sc.nextLine(); // it does not take only a word. It takes whole sentence.
//    

//        System.out.println(age + "\n" + name1 + "\n" + num + "\n" + name2 );

        //b. Assignment Operators:
        // a = b
        // a += b --> a = a+b
        // a -= b --> a = a-b
        // a *= b --> a = a*b
        // a /= b --> a = a/b
        
        //Ex:
        // int a = 10;
        // int b = 5;

        // a = b;     // a = 5
        // System.out.println("a = b: " + a);

        // a += b;    // a = a + b → 5 + 5 = 10
        // System.out.println("a += b: " + a);

        // a -= b;    // a = a - b → 10 - 5 = 5
        // System.out.println("a -= b: " + a);

        // a *= b;    // a = a * b → 5 * 5 = 25
        // System.out.println("a *= b: " + a);

        // a /= b;    // a = a / b → 25 / 5 = 5=b);
        // System.out.println("a /= b: " + a);


        //c. Comparison/Relational Operators
//        Relational operators define the relation between 2 entities.
//        They give a boolean value as result i.e true or false.
          // a==b
          // a!=b
          // a>b
          // a<b
          // a<=b
          // a>=b

        //Ex:
        // int a = 10;
        // int b = 20;

        // System.out.println("a == b : " + (a == b));   // false
        // System.out.println("a != b : " + (a != b));   // true
        // System.out.println("a > b  : " + (a > b));    // false
        // System.out.println("a < b  : " + (a < b));    // true
        // System.out.println("a >= b : " + (a >= b));   // false
        // System.out.println("a <= b : " + (a <= b));   // true

         
        // Conditional statement

        //if-else

        //Type-1
//        boolean isSunup = true;
//        if(isSunup==true)
//            System.out.println("DAY");
//        else
//            System.out.println("Night");



        //Type-2 (USER INPUT AND NESTED IF-ELSE)
        // Day or Night code
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Tell the sun is up or down: ");
//        String sun = sc.next();
//
//        String up = "up";
//        String down = "down";
//
//        // string does not compare with == sign, this is compare with sun.equals(string) or sun.equalsIgnoreCase(string)
//        if (sun.equals(up)) {
//            System.out.println("DAY");
//        }
//        else if (sun.equalsIgnoreCase(down)) {
//            System.out.println("NIGHT");
//        }
//        else {
//            System.out.println("Invalid Input");
//        }

        // Able to vote or not code
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(age>18)
//            System.out.println("Vote");
//
//        else
//            System.out.println("Can't Vote");
//


        //d.Logical Operators

//        int a = 30;
//        int b = 40;

        // &&
//        if(a<50 && b<50)  // Both condition needs to be correct.
//            System.out.println("Both are less than 50");
        // ||
//        if (a<50 || b>50)  // At least one condition need to be correct.
//            System.out.println("At least one less than 50");


        // !
//        boolean isAdult = false;
//        if(!isAdult)  // !(NOT) reverse the condition, if condition !true == false or !false == true.
//            System.out.println("is Adult");
//        else
//            System.out.println("not Adult");


//        Notebook price = 40 , Pen price = 10 take input from user about the price and suggest which they buy it
//        between this price

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your price: ");
//        int price = sc.nextInt();
//
//        if (price==10){
//            System.out.println("You can only buy a pen");
//        } else if (price==40) {
//            System.out.println("You can buy only a Notebook or a pen");
//
//        } else if (price>10 && price<40) {
//            System.out.println("You can only buy a pen and buy a Notebook as well if u slightly increase the price");
//
//        } else if (price>40 && price<50) {
//            System.out.println("You can buy a Notebook and buy a pen as well if u slightly increase the price");
//
//        } else if (price>=50) {
//            System.out.println("You can buy both Notebook and Pen");
//
//        } else if (price>=0 && price<10 ) {
//            System.out.println("Not sufficient foy buying anything at least you have 10 rupees");
//
//        } else {
//            System.out.println("Not valid");
//        }


        // Switch-case
//        Switch case statements are a substitute for long if statements that compare a
//        variable to multiple values. After a match is found, it executes the
//        corresponding code of that value case.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1-7: ");
//        int day = sc.nextInt();
//        switch(day) {
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default :
//                System.out.println("Invalid Input");
//        }


    }
}
