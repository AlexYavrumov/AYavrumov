package HW_to_Lesson9.AnimalsRefactored;

public class Hamster extends Pet implements Voice{

    Hamster(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster(1787, 1, 0.200, "White", "Homa", false);
        hamster.voice();
    }
    public void voice() {
        System.out.println(Voice.voice() + "my name is " + name + "." + " Meow.");
    }
}