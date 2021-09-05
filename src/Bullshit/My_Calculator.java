package Bullshit;
import java.util.Scanner;

public class My_Calculator
{

    static public Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        All();
    }


    public static long getLong()
    {
        System.out.println("Введите число:");

        long num;

        if (scanner.hasNextInt())
        {
            num = scanner.nextInt();

        } else {

            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");

            scanner.next();

            num = getLong();
        }

        return num;
    }


    public static char getOperation()
    {
        System.out.println("Введите операцию:");

        char operation;

        if (scanner.hasNext())
        {
            operation = scanner.next().charAt(0);

        } else {

            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте ещё раз.");

            scanner.next();

            operation = getOperation();
        }

        return operation;
    }


    public static long calc(long num1, long num2, char operation)
    {
        long result;

        switch (operation)
        {

            case '+':

                result = num1 + num2;

                break;

            case '-':

                result = num1 - num2;

                break;

            case '*':

                result = num1 * num2;

                break;

            case '/':

                result = num1 / num2;

                break;

            default:

                System.out.println("Операция не распознана. Повторите ввод ещё раз.");

                result = calc(num1, num2, getOperation());

        }

        return result;

    }


    public static void All()
    {
        long num1 = getLong();

        long num2 = getLong();

        char operation = getOperation();

        long result = calc(num1, num2, operation);

        System.out.println("Результат операции: " + result);

        System.out.println("Программа приостановлена.");
    }

}