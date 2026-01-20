
// Basic format to write java syntax

class Main {    
    public static void main(String[] args) { 
       System.out.println("Hello World!!!"); 
    } 
}

// Explain each line

class Main {
🔹 Defines a class named Main
🔹 Every Java program must have at least one class
🔹 The filename is usually Main.java

public static void main(String[] args) {
🔹 main method – execution starts from here
🔹 public → JVM can access this method because it has public access modifire
🔹 static → No object needed to run this method
🔹 void → Returns nothing
🔹 String[] args → Command-line arguments. String-->(data type in text format), []--> Array format , args--> It is a variable name, we can change it anytime.

System.out.println("Try programiz.pro");
🔹 System → Built-in Java class
🔹 out → Output stream (prints to console)
🔹 println() → Prints text and moves to next line
🔹 "Hello World!!!" → String to be printed

} --> Closed the main method

} --> closed the Main class