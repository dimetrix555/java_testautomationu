package chapter10_exercises;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();
        apple.makeJuice();

        Fruit banana = new Banana();
        ((Banana) banana).peel();
        banana.makeJuice();
    }
}
