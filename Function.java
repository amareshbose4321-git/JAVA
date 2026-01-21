// What is a Function in Java?

// In Java, a function is called a method.
// A method is a block of code that performs a specific task and runs only when it is called.


// 👉 Methods help to:

// Avoid code repetition
// Make code reusable
// Improve readability and maintenance


// 🔹 Syntax of a Method (Function)
      
// returnType methodName(parameters) {
//     // code
//     return value; // optional (if void then no return, if int/float/double..etc then return)
// }

// here we write public(access modifire) returnType methodName(parameters)

// A method can have access modifiers like:
// public --> The method can be accessed from anywhere (other classes, other packages).
// private --> Accessible only inside the same class. Not accessible outside the class
// protected --> Accessible: Within the same class, Within the same package, In child (sub) classes (even in different packages).But without inheritence we cant use in fifferent packages.
// (default – no keyword) --> Accessible only within the same package. If other packages are used then we write public.

// static--> Because we are calling it without creating an object.

// 🔹 What is Function Calling?

// Function calling means invoking (using) a method so that the code inside it executes.


// Example:
 // calling a method
// methodName();     // if it is in same class.
//Classname.methodName();  // if it is in different class.


// Using same Class
//class-1
// public class Function {
//     // function definition
//     static void PrintName(String Name) {
//         System.out.println("Your name is: " + Name);
//     }

//     public static void main(String[] args){
//         //function call
//         PrintName("Amaresh"); // methodName(); 
//     }
// }


// Using Different Class
//class-1
//class name{

      // function definition
//    static void PrintName(String Name){
//        System.out.println("Your name is: "+Name);
//    }
//}

//class-2
//public class Function {
      //function call
//    public static void main(String[] args){
//        name.PrintName("Amaresh"); // Classname.methodName; 
//    }
//}

// 👉 For learning & small programs → Same class is OK
// 👉 For real projects & good practice → Create other classes (better option)

//class-1
// class Summation{  // In java we write o

//     // function definition
//     static int sum(int x, int y) {
//         int sum = x + y;
// //        Here use println with normal format.
//         System.out.println("The sum of " + x + " + " + y + " = " + sum);

// //        Here use printf and %d → integer placeholder, %n → new line (platform independent).
// //        System.out.printf("The sum of %d + %d = %d%n",x,y,sum);
//         return sum;
//     }
// }

// //class-2
// public class Function{
//     public static void main(String[] args){
//         //function call
//         Summation.sum(5,6);
//     }
// }

//Make a simple calculator:

// import java.util.Scanner;

// //class-1
// class Calc{  // In java we write o

//     // function definition

//     static int sum(int x, int y) {
//         int sum = x + y;
//         System.out.println("The summation of " + x + " + " + y + " = " + sum);
//         return sum;
//     }
//     static int sub(int x, int y) {
//         int sub = x - y;
//         System.out.println("The substraction of " + x + " - " + y + " = " + sub);
//         return sub;
//     }
//     static int mul(int x, int y) {
//         int mul = x * y;
//         System.out.println("The multiplication of " + x + " * " + y + " = " + mul);
//         return mul;
//     }
//     static float div(int x, int y) {
//         float div = x / y;
//         System.out.println("The division of " + x + " / " + y + " = " + div);
//         return div;
//     }

// }

// //class-2
// public class Function {
//     public static void main(String[] args){
//         // take input
//         Scanner sc = new Scanner(System.in);

//         // input-1
//         System.out.println("Enter 1st number: ");
//         int a = sc.nextInt();

//         // input-2
//         System.out.println("Enter 2nd number: ");
//         int b = sc.nextInt();

//         System.out.println("//function call take input from user");
//         //function call take input from user
//         Calc.sum(a,b);
//         Calc.sub(a,b);
//         Calc.mul(a,b);
//         Calc.div(a,b);
        
//         System.out.println("//function call without input from user");
//         //function call without input from user
//         Calc.sum(6,4);
//         Calc.sub(7,3);
//         Calc.mul(5,6);
//         Calc.div(45,5);

//         sc.close(); // close scanner at end

//     }
// }

// 🔹 sc.close()-->What it does
// Scanner sc = new Scanner(System.in); opens a resource to read input from the keyboard.
// sc.close(); tells Java:
// "I am done using this Scanner, you can free the resources."
// This is important in real projects because leaving resources open can cause memory leaks or resource exhaustion.


//Take input a number from user and find factorial (using in same class)

// import java.util.Scanner;

// public class Function {

// // Factorial

//     public static int calcFact(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }


//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number: ");

//         int n = sc.nextInt();
       
//         int fact = calcFact(n); // store the function in other fact veriable

//         //print the function
//         System.out.println("Factorial is: "+fact);

//         sc.close(); // close scanner at end
//     }
// }