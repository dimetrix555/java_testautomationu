package chapter10_exercises;

public class Banana extends Fruit {
    public Banana() {
        this.calories = 100;
    }

    public void peel() {
        System.out.println("Banana has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made.");
    }
}
