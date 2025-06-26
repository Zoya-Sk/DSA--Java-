package Lecture3Operators;

public class practiceQs {
    public static void main(String[] args) {

        //  QS 1.
        // int x = 2, y = 5;
        // int exp1 = (x*y/x);
        // int exp2 = (x*(y/x));
        
        // System.out.println(exp1);
        // System.out.println(exp2);
        // System.out.println(2+"2"+2);
        // // int res = (5+7/2-(5-3));
        // int res = 5-(10*15/2-(7+4));
        // System.out.println(res);


        // QS 2.
        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);
        

        //  QS 3. 
        int a = 20;
        int b = 3;

        System.out.println("Initial Value of a & b :" + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after Swapping : " + a + " , " + b);

    }

}
