import java.util.*;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amounts of Pen, Pencil, Eraser:");
        double pen = sc.nextDouble();
        double pencil = sc.nextDouble();
        double eraser = sc.nextDouble();

        double total = pen + pencil + eraser;
        System.out.println("Total Amount: "+ total);
        double taxAmount = (total * 0.18);
        System.out.println("Tax Amount is "+ taxAmount);

        sc.close();
    }
}
