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
public class Function {
    // function definition
    static void PrintName(String Name) {
        System.out.println("Your name is: " + Name);
    }

    public static void main(String[] args){
        //function call
        PrintName("Amaresh"); // methodName(); 
    }
}


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
