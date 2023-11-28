package animals;

public class Snake extends Carnivorous implements Voiceable {

    public Snake(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The snake " + getName() + " is carnivorous animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public String voice() {
        return "This snake says \"Shhh\"";
    }
}
