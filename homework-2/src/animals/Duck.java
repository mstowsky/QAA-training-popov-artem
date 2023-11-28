package animals;

public class Duck extends Herbivore implements Flyable, Runnable, Swimable, Voiceable {

    public Duck(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The duck " + getName() + " is carnivorous animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public void fly() {
        System.out.println("This duck can fly.");
    }

    @Override
    public void run() {
        System.out.println("This duck can run.");
    }

    @Override
    public void swim() {
        System.out.println("This duck can swim.");
    }

    @Override
    public String voice() {
        return "This duck says \"Krya krya\"";
    }
}
