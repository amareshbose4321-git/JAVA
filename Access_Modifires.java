// A method can have access modifiers like:

// public --> The method can be accessed from anywhere (other classes, other packages).
// private --> Accessible only inside the same class. Not accessible outside the class
// protected --> Accessible: Within the same class, Within the same package, In child (sub) classes (even in different packages).But without inheritence we cant use in fifferent packages.
// (default – no keyword) --> Accessible only within the same package. If other packages are used then we write public.

// static--> Because we are calling it without creating an object.


//🔹 Can we have 2 public classes in one file?

// ❌ NO

// public class A {
// }
// public class B {
// }

// 🚫 Compile-time error
// 📌 Only ONE public class per .java file


// 🔹 Can we have private class?

// ❌ NO (top-level class)

// private class A {
// }

// 🚫 NOT allowed
// 📌 private class is allowed only for inner classes


// 🔹 Can we have protected class?

// ❌ NO (top-level class)

// protected class A {
// }

// 🚫 NOT allowed
// 📌 protected is also allowed only for inner classes


// 🔹 What is ALLOWED?

// ✔ One public class + multiple default (no modifier) classes

// public class A {
// }

// class B {
// }

// class C {
// }


// ✔ File name must be A.java

// 🔹 Inner Classes (Special Case)
// public class Outer {

//     private class Inner1 {
//     }

//     protected class Inner2 {
//     }

//     public class Inner3 {
//     }
// }

// ✔ private, protected, public are allowed for inner classes



public class Access_Modifires {
    
}
