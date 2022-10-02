
package javaprogrammingproblem_bazlursbook;

/**
 * @author Md. Talal Wasim.
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class JavaProgrammingProblem_BazlursBook {

    public static void main(String[] args) {
        /*
        Java Programming By - Bazlur Rahman
        CHAPTER -02, Problem # 01
        
        1. Write a Java program which takes 4 integer as input, 
        if all numbers are equal to each other, 
        Then Print All are equal. If all are not equal then print
        Not equal.
        
        */
        
        int n1,n2,n3,n4;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1 : ");
        n1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = input.nextInt();
        System.out.print("Enter number 3 : ");
        n3 = input.nextInt();
        System.out.print("Enter number 4 : ");
        n4 = input.nextInt();
        
        if ( (n1==n2) && (n1== n3) && (n1==n4 )) {
            System.out.println("All are equal");
        }
        else{
            System.out.println("Not equal");
        }
        
        
        
        
    }
    
}
