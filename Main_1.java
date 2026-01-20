import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {
        // our first program
//        System.out.println("Hello");

        // For single line comment use ---> //
        // For multiline comment use ---> /**----**/
        // Windows shortcut is ---> ctrl + /
        // select or change multi lines simultaneously --> Alt + Shift

        // variables
        /**
         * A variable is a container (storage area) used to hold data.
         Each variable should be given a unique name (identifier).
         **/
//        int age = 22;
//        String name = "Amaresh";
//        float num = 2.865F;

                
       // Primitive Data Types
//        These are the data types of fixed size.
//        store the actual value and built in.
//        total 8 primitive data type exists in java.

//        boolean num2 = True; // size - 1-bit(logical)
//        byte age = 30; // size - 1-byte(8-bit)
//        short c = 4561; // size - 2-byte(16-bit)
//        char ch = '@'; // size - 2-byte(16-bit)
//        int a = 1234567854; // size - 4-byte(32-bit) --> if we increase the number then it shows error so we use long
//        float pi = 3.14F; // size - 4-byte(32-bit)
//        long b = 45687875565621L; // size - 8-byte(64-bit) --> This is the log value
//        double num1 = 4894.36546987D; // size - 8-byte(64-bit)

       // Non - Primitive Data Types
//        User defined, store references(address) of an object.
//        unlimited non-primitive data type exists becouse of user defined.
//        String, Array, class, interfeces all are non-primitive data types.

          //## String --> String is a non-primitive (reference) data type used to store a sequence of characters.

//        String name = "Amaresh"; // Type -1 to print a string
//        String friend = new String("Aman"); // Type -2 to print a string using 'new' keyword
//        System.out.println(name);
//        System.out.println(friend);

        //concatenation -- add two strings
//        System.out.println(name + " and " + friend);

        //charAt --> find any character in the string based on their idx no.
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(2)); // index number starts in 0,1,2.....

        //length --> total length of the string
//        System.out.println(name.length());
//        System.out.println(friend.length());

        //replace --> replace the characters one to the another in string.
//        String name2 = name.replace('A','a'); // new replace string
//        System.out.println(name); // Original string print
//        System.out.println(name2); // new replace string print
        //** we can't change the original string because strings are immutable(not changing), but we create a new string and then change it.

        // substring --> small portion of total string.
//        String name = "Aman and Amaresh";
//        System.out.println(name.substring(0, 4)); // name.substring(start idx : 0, end idx: end+1)
//        System.out.println(name.substring(9, 16));


        //## Array --> Collection of values in same variable.

//        not using array
//        int marks1 = 54;
//        int marks2 = 64;
//        int marks3 = 86;
//        int marks4 = 85;

//       using array - 1D Array(type-1 using new key word)
//        int[] marks = new int[4]; --> array star with 0,1,2,3,.....
//        marks[0] = 78;
//        marks[1] = 64;
//        marks[2] = 86;
//        marks[3] = 85;
//        System.out.println(marks[2]);

        //length - total length of array.
//        System.out.println(marks.length);

        //Arrays.sort() --> sorting the array small to large.
//        System.out.println(marks[0] +" "+ marks[1] +" "+ marks[2] +" "+ marks[3]);
//        Arrays.sort(marks);
//        System.out.println(marks[0] +" "+ marks[1] +" "+ marks[2] +" "+ marks[3]);

        // type 2 - 1D Array(not using new keyword)
//        int[] marks = {89,96,78,91,64};
//        System.out.println(marks[3]);

//         //length
//         System.out.println(marks.length);

//         //Arrays.sort
//         System.out.println(Arrays.toString(marks)); --> ALL Array printed
//         Arrays.sort(marks);
//         System.out.println(Arrays.toString(marks));


        // type 3 - 2D Array
//        int[][] marks = {{89,78,85},{56,85,64},{98,95,87}};
//        System.out.println(marks[1][2]);

        // Casting --> one type to another type.
        // Implicit casting
//        This casting is done by java implicitly i.e. on its own. It is assigning
//        smaller values to larger data types.

//        float price = 100.00F;
//        float gst = 18.00F;
//        double FinalPrice = price + gst;
//        System.out.println(FinalPrice);

        // Explicit casting
//        This casting is done by the programmer. It is assigning larger values to
//        smaller data types.

//        float price = 110.50F;
//        float gst = 18.23F;
//        double FinalPrice = (int) price + (int) gst; // only add int values using explicit casting (110 + 18 = 128)
//        System.out.println(FinalPrice);


        // Constants
//        A constant is a variable in Java which has a fixed value i.e. it cannot be assigned
//        a different value once assigned.

//        int age = 22; //age can't be constant because it is change.
//        System.out.println(age); // o/p--> 22
//        age = 23;
//        System.out.println(age); // o/p--> 23
//        age =24;
//        System.out.println(age); // o/p--> 24
//
//        final float PI = 3.14F; // PI value is same always, so it is constant by using final keyword.
//        PI = 5.66F; // can't change PI value because it's constant now.


    }
}