package HW_to_Lesson6;

public class Pet extends Animal
{
    String name;

    boolean isVaccinated;

    Pet (int id, int age, double weight, String color, String name, boolean isVaccinated)
    {
        super(id, age, weight, color);

        this.name = name;

        this.isVaccinated = isVaccinated;
    }

}