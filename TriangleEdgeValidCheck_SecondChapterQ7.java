
package javaprogrammingproblem_bazlursbook;

import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class TriangleEdgeValidCheck_SecondChapterQ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Enter Edge 1 Value: ");
        a = input.nextInt();
        System.out.print("Enter Edge 2 Value: ");
        b = input.nextInt();
        System.out.print("Enter Edge 3 Value: ");
        c = input.nextInt();
        
        if ( (a>=b && a>=c) ) {
            
            if (a < (b+c) ) {
                System.out.println("Valid");
            }
            else{
                    System.out.println("Invalid");
                }
        
        }
        else if ((b>=a && b>=c)) {
            if (b < (a+c) ) {
                    System.out.println("Valid");
                }
            else{
                    System.out.println("Invalid");
                }
        }
        else if (c>= a && c>= b) {
             if (c < (a+b) ) {
                    System.out.println("Valid");
                }
             else {
            System.out.println("Invalid");
        }
             
        }
        else {
            System.out.println("Invalid");
        }
            
/*       if (a>=b && a>=c) {
            if (a < (b+c) ) {
                System.out.println("Valid");
            }
            else{
                    System.out.println("Invalid");
                }
        }
        
        if (b>=a && b>=c) {
            if (b < (a+c) ) {
                    System.out.println("Valid");
                }
            else{
                    System.out.println("Invalid");
                }
        }
        if ( (c>=a && c>=b) ) {
                if (c < (a+b) ) {
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
        }
       
 */          // System.out.println(""+(a+c));
        
    }
       
       
    }
//}
