package Homework3_Package;
import java.util.Scanner;
public class Homework2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number:" );

        int n = in.nextInt();

        int a = 1;

        for (int i = 1; i <= n; i++)
        {
            a = a * i;
        }

        System.out.println("n! = " + a);
    }
}