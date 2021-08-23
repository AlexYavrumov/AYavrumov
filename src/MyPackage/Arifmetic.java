package MyPackage;
import java.util.Scanner;
public class Arifmetic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int count = 0;

        int n = 0;

        do {
            System.out.println("Введите число(введите -1, если хотите закончить ввод чисел): ");

            n = sc.nextInt();

            System.out.println("Число: " + n);

            if(n != -1)
            {
                count++;

                sum = sum + n;
            }

        } while ( n != -1);

        sc.close();

        System.out.println("Среднее арифметическое: " + (double) sum/count);
    }
}