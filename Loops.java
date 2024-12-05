   //    -:  FOR LOOP  :-

// public class Loops {
//     public static void main (String[] args){
//         // counter++ = (counter = counter + 1)
//         for (int counter = 0; counter<11; counter++){
//             System.out.println("Hellow World");             it will be print in one by one line
//         }    
//     }
// }


// public class Loops {
//     public static void main (String[] args){
//         // counter++ = (counter = counter + 1)
//         for (int counter = 0; counter<11; counter++){
//             System.out.println(counter);                  it will be print in one by one line
//         }    
//     }
// }


// public class Loops {
//     public static void main (String[] args){
//         // counter++ = (counter = counter + 1)
//         for (int counter = 0; counter<11; counter++){
//             System.out.print(counter+ " ");               it will be print in one line
//         }    
//     }
// }



// public class Loops {
//     public static void main (String[] args){
//         //  counter  = i
//         for (int i = 0; i<11; i++){
//             System.out.println(i);         it will be print in one by one line
//         }    
//     }
// }


// public class Loops {
//     public static void main (String[] args){
//         //  counter  = i                               
//         for (int i = 0; i<11; i++){
//             System.out.print(i+ " ");       it will be print in one line
//         }    
//     }
// }


//              -:  WHILE LOOP  :-

// public class Loops {
//     public static void main (String[] args){

//         int i = 0 ;
//         while(i <  11) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }    



//             -:  DO WHILE LOOP  :-


// public class Loops {
//     public static void main (String[] args){

//         int i = 0;
//         do {
//             System.out.println(i);
//             i = i+1;
//         }   while(i<11);
//     } 
// }   

      

            //  -:First N NATURAL NUMBER SUM:-


//  import java.util.*;

//  public class Loops{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n:");
//         int n = sc.nextInt();

//         int sum = 0;
         
//         for (int i = 0; i<=n; i++){
//              sum = sum + i;
        
//         }

//         System.out.println(sum);    
//     }

// }



    //           -:Print table of the 2 :-


    // import java.util.*;

    // public class Loops {
    //     public static void main (String[] args){
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter the value of n:-");
    //         int n = sc.nextInt();

    //         for(int i = 1; i<11; i++){
    //             System.out.println(i*n);
    //         }
    //     }
    // }

//                   -:NESTED LOOP:-

    //     public class Loops {
    //          public static void main (String[] args){
    //              int n = 4;
    //              int m = 5;

    //              for(int i = 1; i<=n; i++){
    //                 // inner loop

    //                 for(int j = 1; j<=m; j++){
    //                  System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //     } 
    // }  
    

//                     -: PRINT HOLO RECTANGLE :-

//  public class Loops {
//     public static void main(String[] args){
//         int n = 4; Number of rows
//         int m = 5; Number of columns

//         // outer loop
//         for (int i = 1; i<=n; i++) {
//             // inner loop
    
//             for(int j = 1;j<=m; j++){
//                 // cell -> (i,j)
//                 if(i == 1 || j ==1 || i == n || j == m){
//                 System.out.print("*");
//                 } else {
//                    System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//  public class Loops {
//     public static void main(String[] args) {
         
//         int n = 4;
//         for (int i = 1; i<=n; i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
            

// public class Loops {
//     public static void main(String[] args) {
         
//         int n = 4;
//         for (int i = n; i>=1; i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Loops{
//     public static void main(String[] args){
//         int n = 4;
        
//         for(int i = 1; i<=n; i++){
    
//            for (int j=1; j<=n-i; j ++){
//                 System.out.print("");
//             }

//             for (int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }