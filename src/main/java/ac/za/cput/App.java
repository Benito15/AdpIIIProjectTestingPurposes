package ac.za.cput;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("---------------");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int a = in.nextInt();

        System.out.println("Enter number");
        int b = in.nextInt();
        int result = a+b;

        System.out.println("The sum of the two numbers is " + result );

    }
}
