
package javaprogrammingproblem_bazlursbook;

import java.util.Scanner;

/**
 * Java Programming By - Bazlur Rahman
        CHAPTER -02, Problem # 02
 * 2. Write a program which takes five integer value and calculate average.
 * 
 * 
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 
 */
public class FindAverageSecondChapterQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        
        System.out.print("Enter number 1: ");
        n1 = input.nextInt();
        System.out.print("Enter number 2: ");
        n2 = input.nextInt();
        System.out.print("Enter number 3: ");
        n3 = input.nextInt();
        System.out.print("Enter number 4: ");
        n4 = input.nextInt();
        System.out.print("Enter number 5: ");
        n5 = input.nextInt();
       
        int avg = (n1 + n2 + n3 + n4 +n5)/5;
        System.out.println("Average is :"+avg);
    }
}
