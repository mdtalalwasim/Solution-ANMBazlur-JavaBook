
package javaprogrammingproblem_bazlursbook;

import java.util.Scanner;

/**
 * Java Programming By - Bazlur Rahman
        CHAPTER -02, Problem # 02
  
 * Write a Java Program which calculate your Body Mass Index(BMI).
 * Formula for BMI = w/h*h [Where w = weight in KG, h=height in meter]
 * 
 * 
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class CalculateBMISecondChapterQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double weight, height, bmi;
        System.out.print("Enter your Weight in KG :");
        weight = input.nextDouble();
        System.out.print("Enter your Height in Meter :");
        height = input.nextDouble();
        
        bmi = weight/(height*height);
        
        System.out.println("You Body Mass Index(BMI) is : "+bmi);
    }
}
