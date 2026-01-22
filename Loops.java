import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        //LOOPS
        // loops are used to repeat a block of code until a condition is met.
        //Java mainly has 4 types of loops

        //1. for loop: Used when you know how many times the loop should run.

        //Syntax

//       for(initialization; condition; increment/decrement){
//           // code
//       }

        //ex:        
        //Print number 1-5
//        for(int i = 1 ; i<=5 ; i++){
//            System.out.println(i);
//        }
       
        //ex:   
        //Print number 5-1
//        for(int i = 5 ; i>=1 ; i--){
//            System.out.println(i);
//        }

      //2. while loop : Used when you don't know how many times the loop should run.

      //Syntax
      
//      while(condition){
//          // code
//      }

         //ex:
//        int j = 5;
//        while(j>=1){
//            System.out.println(j);
//            j--;
//        }

        //3. Do-while loop: Runs at least once, even if the condition is false.

        //Syntax
//        do{
//          code
//        } while(condition);

        //ex:
//        int k = 5;
//        do{
//            System.out.println(k);
//            k--;
//        } while (k>=1);

// Difference betwwen while and do while:
// In while we 1st check the condition and the execute the loop.
// In do-while 1st atleast one time operation perform and then check the condition to execute loop. 

// take positive numbers from user and print that number until the number is negative.

        //Using for lopp :

//        System.out.println("----START----");
//        for(;;){ // infinite loop
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            int number = sc.nextInt();
//
//            if(number < 0){
//                System.out.println("----THE END----");
//                break; //stop the loop
//            }
//            else {
//                System.out.println("Your number is: " + number);
//            }
//        }

        
          //Using while loop :

//        int num = 0;
//        System.out.println("----START----");
//        while (num >= 0){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            num = sc.nextInt();
//            if(num < 0){
//                System.out.println("----THE END----");
//            } else {
//                System.out.println("Your number is: "+num);
//            }
//        }
        
        
        //Using do-while loop :

//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        System.out.println("----START----");
//        do {
//            System.out.println("Enter a number: ");
//            num = sc.nextInt();
//            System.out.println("Your number is: "+num);
//        } while (num >= 0);
//        System.out.println("----THE END----");


    }
}
