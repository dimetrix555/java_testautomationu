package chapter10_exercises;

public class Apple extends Fruit {
    public Apple() {
        this.calories = 80;
    }
    public void removeSeeds() {
        System.out.println("Apple seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}
