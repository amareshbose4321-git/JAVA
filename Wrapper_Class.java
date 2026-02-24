
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

public class Wrapper_Class {
    
}
