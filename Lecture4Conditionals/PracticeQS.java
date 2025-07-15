package Lecture4Conditionals;
import java.util.Scanner;

public class PracticeQS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //     // QS. 1
    // System.out.println("Enter a Number: ");
    // int num = sc.nextInt();

    // if(num > 0){
    //     System.out.println("Positive");
    // } else if(num < 0){
    //     System.out.println("Negative");
    // } else{
    //     System.out.println("Zero");
    // }
    


    // QS. 2
    System.out.println("Enter your Temperature: ");
    double temp = sc.nextDouble();
    if(temp < 100){
        System.out.println("You don't have Fever.");
    }else{
        System.out.println("You have Fever!");
    }

    sc.close();
}}
