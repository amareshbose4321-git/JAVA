
public class patterns {
    public static void main(String[] args){
          // solid rectangle
          // *****
          // *****
          // *****
          // *****
//        for (int i=1;i<=4;i++){  // rows = 4 (Outer loop)
//             for(int j=1;j<=5;j++){ // coloum = 5 (Inner loop)
//                System.out.print("*");
//              
//            }
//            System.out.println(); //Next line
//
//        }
        // Hollow rectangle
//        *****
//        *   *
//        *   *
//        *****
//       int n = 4; // for rows
//        int m = 5; // for cols
//        for(int i=1;i<=n;i++){  // rows
              // nested loop
//            for(int j=1;j<=m;j++){  // cols
//               if(i==1 || i==4 || j==1 || j==5){
//                   System.out.print("*");
//               } else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }

        //half pyramid
//*
//**
//***
//****
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        1234
//        123
//        12
//        1
//
//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Inverted-half pyramid
//****
//***
//**
//*
//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Inverted-half pyramid (rotate 180 degree)
//   *
//  **
// ***
//****
//        int n=4;
//         for(int i=1 ;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" "); // for space
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"); // for star
//             }
//             System.out.println();
//         }

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//            int n = 5;
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=i;j++){
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }

//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        // method-1
//        int n = 5;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        // method-2
//                int n = 5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int num = 1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++; // num = num+1
//            }
//            System.out.println();
//        }

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        int n = 5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int sum = i+j;
//                if(sum % 2 == 0){ // even = 1
//                    System.out.print(1+" ");
//                } else{  // odd = 0
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }

//Butterfly structure
//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *
//                int n = 5;
//
//                // Upper part
//                for (int i = 1; i <= n; i++) {
//
//                    // Left stars
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("*");
//                    }
//
//                    // Spaces
//                    for (int j = 1; j <= 2 * (n - i); j++) {
//                        System.out.print(" ");
//                    }
//
//                    // Right stars
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("*");
//                    }
//
//                    System.out.println();
//                }
//
//                // Lower part
//                for (int i = n; i >= 1; i--) {
//
//                    // Left stars
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("*");
//                    }
//
//                    // Spaces
//                    for (int j = 1; j <= 2 * (n - i); j++) {
//                        System.out.print(" ");
//                    }
//
//                    // Right stars
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("*");
//                    }
//
//                    System.out.println();
//                }


// solid Rhombus
//    *****
//   *****
//  *****
// *****
//*****
//                int n = 5;
//
//                for (int i = 1; i <= n; i++) {
//
//                    // leading spaces
//                    for (int j = 1; j <= n - i; j++) {
//                        System.out.print(" ");
//                    }
//
//                    // stars
//                    for (int j = 1; j <= n; j++) {
//                        System.out.print("*");
//                    }
//
//                    System.out.println();
//                }
//

//Number pyramid


//Diamond Pattern

        int n = 5;
        int f = 1;
        for(int i=1 ; i<=n;i++){
            f=f*i;

        }
        System.out.println(f);

    }
}
