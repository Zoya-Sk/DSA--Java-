package Lecture2;
import java.util.*;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        double avg = sum/3.0;

        System.out.println("Average of 3 Numbers is "+ avg);

        sc.close();
    }
    
}