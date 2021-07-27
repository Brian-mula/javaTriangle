import java.util.Scanner;

public class JavaMath{
public static void main(String[] args) {
    double x;
    double y;
    double z;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter X:");
    x=scanner.nextDouble();
    System.out.println("Enter y :");
    y=scanner.nextDouble();

      z=Math.sqrt((x*x)+(y*y));

      System.out.println("The Hypoteneuse is: "+ z);
}
}