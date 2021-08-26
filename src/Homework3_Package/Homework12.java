package Homework3_Package;
public class Homework12
{
    public static void main(String[] args)
    {
        int[] array = {3, 9, 7, 4, 20, 17, 8};

        double average;

        double sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        average = sum / array.length;

        System.out.println(average);
    }
}