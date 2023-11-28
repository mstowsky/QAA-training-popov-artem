package animals;

public class FlyingSquirrel extends Herbivore implements Flyable, Runable {

    public FlyingSquirrel(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The squirrel " + getName() + " is herbivore animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public void fly() {
        System.out.println("This squirrel can fly.");
    }

    @Override
    public void run() {
        System.out.println("This squirrel can run.");
    }
}
