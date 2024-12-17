package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Voiceable;

public class Lion extends Carnivorous implements Runable, Voiceable {

    public Lion(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The lion " + getName() + " is carnivorous animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public void run() {
        System.out.println("This lion can run.");
    }

    @Override
    public String voice() {
        return "This lion says \"Roar roar\"";
    }
}
