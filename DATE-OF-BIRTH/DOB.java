// This is my java work in polymorphism with scanner class to get dob.

package Emglitzz;
import java.util.Scanner;
public class DOB {
        static String sum(String a, String b)
        {
            return a + b;
        }
        static String sum(String a, String b, String c)
        {
            return a+b+c;
        }
        public String sum(String x) 
        { 
            return x; 
        }
    public static void main(String[] args) {
        PolyWithScanner p = new PolyWithScanner();
        Scanner i = new Scanner(System.in);
        System.out.println("Enter your Date of Birth");
        System.out.println("Enter Date in your Date of birth");
        String a = i.next();
        System.out.println("Enter your Month");
        String b = i.next();
        System.out.println("Enter your Year");
        String c = i.next();
        System.out.println("Enter your Whole DOB");
        String x = i.next();
        System.out.println(p.sum("DOB With Only Date and Month : " + a + " " + b));
        System.out.println(p.sum("DOB With Only Date and Year : " + a + " " + c));
        System.out.println(p.sum("Your Whole DOB : " + x));

        // System.out.println(p.sum("08 ", "2004")); 
        // System.out.println(p.sum("08 ", "03 ", "2004"));
        // System.out.println(p.sum("08-03-2004"));
    }
}
