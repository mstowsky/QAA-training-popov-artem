package animals;

public class Cow extends Herbivore implements Runable, Voiceable {

    public Cow(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The cow " + getName() + " is herbivore animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public void run() {
        System.out.println("This cow can run.");
    }

    @Override
    public String voice() {
        return "This cow says \"Moo moo\"";
    }
}
