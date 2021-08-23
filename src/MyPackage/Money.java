package MyPackage;
import java.util.Scanner;
public class Money
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму денежного вклада");

        long money = sc.nextInt()*100;

        System.out.println("Введите процент годовых");

        int p = sc.nextInt();

        System.out.println("Введите длительность вклада");

        int years = sc.nextInt();

        for (int i = 0; i < years; i++)
        {
            long h = money*p/100;

            money+=h;
        }

        System.out.println(money/100.0);
    }
}