package Homework3_Package;
import java.util.Arrays;
import java.util.Scanner;
public class Homework8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = 2 * i + 1;
        }

        System.out.print(Arrays.toString(arr));
    }
}