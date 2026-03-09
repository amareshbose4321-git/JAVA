
// 📦 Wrapper Class in Java
// 🔹 What is Wrapper Class?
// A Wrapper Class is a class that converts a primitive data type into an object.

// 👉 In simple words:
// Primitive → Object form


// 🔹 Why We Need Wrapper Class?
// Because:
// Java Collections (like ArrayList, HashMap) cannot store primitive types.

// ❌ Not allowed:
// ArrayList<int> list;   // ERROR

// ✅ Allowed:
// ArrayList<Integer> list;   // Correct

// So we use wrapper classes.


// In java 8 Primitive Data Type has equivalent wrapper classes.

// 🔢 Primitive Type → Wrapper Class

// Primitive	Wrapper Class
// int	        Integer
// double	    Double
// float	    Float
// char	        Character
// byte	        Byte
// short	    Short
// long	        Long
// boolean	    Boolean

// Ex - 
// int a = 22; // Premetive Form
// Integer a = 22 // Wrapper class


// 📦 1️⃣ Boxing
// 👉 Boxing = Converting primitive → Wrapper object (manually)
// Before Java 5, we had to do it manually.

// int a = 10;
// Integer obj = new Integer(a);   // Boxing

// Here primitive int is converted into Integer object.

// 📤 2️⃣ Unboxing
// 👉 Unboxing = Converting Wrapper object → primitive (manually)
// Integer obj = new Integer(20);
// int b = obj.intValue();   // Unboxing

// Here object becomes primitive.


// ⚡ 3️⃣ Autoboxing
// 👉 Autoboxing = Automatic Boxing (primitive → object)

// Introduced in Java 5
// int a = 30;
// Integer obj = a;   // Autoboxing (automatic)

// No need to use new Integer().
// Java automatically converts it.


// ⚡ 4️⃣ Auto-Unboxing
// 👉 Auto-Unboxing = Automatic Unboxing (object → primitive)
// Integer obj = 40;
// int b = obj;   // Auto-unboxing

// Java automatically converts object to primitive.


// Wrapper class Different Methods:

// String to Primitive Object: 
// Usinf ValueOf() Method

// // EX:- 1
//     public class Wrapper_Class {
//     public static void main(String[] args) {

//         String s = "100";

//         Integer num = Integer.valueOf(s); // Converts String → Wrapper Object

//         System.out.println(num + 50);
//     }
// }

// EX:- 2
//     public class Wrapper_Class {
//     public static void main(String[] args){

        
//         Integer obj1 = Integer.valueOf("20");
//         Integer obj2 = Integer.valueOf("10");
//         // int x = obj1;   // Auto-Unboxing
//         // int y = obj2;   // Auto-Unboxing
//         System.out.println(obj1+obj2);

//     }
// }

//valueOf() method Using command line:
// public class Wrapper_Class {
//     public static void main(String[] args){
//         int x = Integer.valueOf(args[0]);
//         int y = Integer.valueOf(args[1]);
//         System.out.println(x+y);
//     }
// }
//In terminal write this:
// PS C:\Users\DESKOP\OneDrive\Documents\JAVA\java\JAVA>  javac Wrapper_Class.java <Enter>
// PS C:\Users\DESKOP\OneDrive\Documents\JAVA\java\JAVA> java Wrapper_Class 10 20 <Enter>
// 30 // Output

// String to Primitive Type: 
// Using pase method:

//EX:-1
//     public class Wrapper_Class {
//     public static void main(String[] args) {

//         String s = "100";

//         int num = Integer.parseInt(s); //Return type → primitive (int)

//         System.out.println(num + 50);
//     }
// }

//EX:-2
//     public class Wrapper_Class {
//     public static void main(String[] args){     

//         int a = Integer.parseInt("20");
//         int b = Integer.parseInt("10");
//         System.out.println(a+b);
//     }
// }

//Diffrence between  `parseXxx()` and `valueOf()` method :

// | Feature     | `parseXxx()`                      | `valueOf()`                          |
// | ----------- | --------------------------------- | ------------------------------------ |
// | Return type | Primitive                         | Wrapper Object                       |
// | Example     | `int x = Integer.parseInt("10");` | `Integer x = Integer.valueOf("10");` |
// | Usage       | When primitive is needed          | When object is needed                |


//Primitive object to string :
//Using toString:

//EX:-1
// public class Wrapper_Class {
//     public static void main(String[] args){
// Integer num = 50;
// String str = num.toString();
// System.out.println(str);
//     }
// }

//EX:-1
public class Wrapper_Class {
    public static void main(String[] args){

Integer num1 = 50;
Integer num2 = 40;

String str1 = num1.toString();
String str2 = num2.toString();

System.out.println(str1+str2);
    }
}

// ✔ num → Integer object
// ✔ toString() → converts it to String

