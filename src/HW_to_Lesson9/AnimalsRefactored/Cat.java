package HW_to_Lesson9.AnimalsRefactored;

public class Cat extends Pet
{
    Cat(int id, int age, double weight, String color, String name, boolean isVaccinated)
    {
        super(id, age, weight, color, name, isVaccinated);
    }


    public static void main(String[] args)
    {
        Cat cat = new Cat(1457, 15, 7.267, "White", "Barsik", true);

        cat.voice();
    }


    public void voice()
    {
        System.out.println(Voice.voice() + "my name is " + name + "." + " Meow.");
    }
}