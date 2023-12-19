package animals.carnivorous;

import animals.Animal;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            satietyLevel += food.getFoodValue();
            System.out.println(getName() + " is eating meat food. Now its satiety is " + satietyLevel + "."); //животное съело пищу, вывод степени насыщения
        } else {
            System.out.println(getName() + " doesn't want to eat a plant food."); //сообщение о том, что животное не ест растительную пищу
        }
    }
}