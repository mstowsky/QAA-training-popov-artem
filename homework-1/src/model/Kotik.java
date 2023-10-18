package model;

public class Kotik {
    private static int kotikCount = 0;
    private String name;
    private double weight;
    private int isNotHungry; // 0 - чем ближе к нулю, тем кот голоднее
    private String meow;

    private static void encreaseCounter() {
        kotikCount += 1;
    }

    public static int getCounter() {
        return kotikCount;
    }

    // параметризированный конструктор объекта:
    public Kotik(String name, double weight, String meow) {
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.isNotHungry = (int) (Math.random() * 10); // степень голода устанавливается случайным числом от 0 до 10
        encreaseCounter();
    }

    // конструктор объекта без аргументов:
    public Kotik() {
        encreaseCounter();
    }

    // сеттеры и геттеры для параметров класса model.Kotik:
    public void setName(String name) {this.name = name;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setIsHungry() {this.isNotHungry = (int) (Math.random() * 10);} // степень голода устанавливается случайным числом от 0 до 10;
    public void setMeow(String meow) {this.meow = meow;}
    public String getName() {return name;}
    public double getWeight() {return weight;}
    public int getIsNotHungry() {return isNotHungry;}
    public String getMeow() {return meow;}

    public void newCatHere() {
        System.out.println("We have new cat here! His name is " + name + ", he weights " + weight + " kg, he is satisfied (not hungry) for " + isNotHungry + ".");
    }

    private void wantToEat(String cantDoAction) { // вывод сообщения о голодном коте
        System.out.print(name + " doesn't want to " + cantDoAction + ", because he is hungry! ");
        eat();
    }

    // 5 дел для распорядка дня:
    public void play() {
        System.out.println(name + " is playing with toys.");
        isNotHungry -= 1;
    }

    public void sleep() {
        System.out.println(name + " is sleeping now.");
        isNotHungry -= 1;
    }

    public void chaseMouse() {
        System.out.println(name + " is chasing the mouse.");
        isNotHungry -= 1;
    }

    public void scratchSofa() {
        System.out.println(name + " is scratching the sofa.");
        isNotHungry -= 1;
    }

    public void washHimself() {
        System.out.println(name + " is washing himself.");
        isNotHungry -= 1;
    }

    // 3 перегруженных метода для кормления:
    public void eat(int isNotHungry, String meal) {
        this.isNotHungry += isNotHungry;
        System.out.println("He took his meal \"" + meal + "\" and now is satisfied for " + isNotHungry + ".");
    }
    public void eat(int isNotHungry) {
        this.isNotHungry += isNotHungry;
        System.out.println("He took his meal and now is satisfied for " + isNotHungry + ".");
    }
    public void eat() {
        eat(1 + (int) (Math.random() * 5), "Sheba"); // покормить кота на 1-5 единиц
    }

    public void liveAnotherDay() {
        for (int hour = 0; hour < 24; hour++) {
            String currentHour = String.format("%02d", hour);
            int caseRandom = 1 + (int) (Math.random() * 5);
            System.out.print(currentHour + ":00 ");
            switch (caseRandom) {
                case 1:
                    if (isNotHungry > 0) play();
                    else wantToEat("play");
                    break;
                case 2:
                    if (isNotHungry > 0) sleep();
                    else wantToEat("sleep");
                    break;
                case 3:
                    if (isNotHungry > 0) chaseMouse();
                    else wantToEat("chase a mouse");
                    break;
                case 4:
                    if (isNotHungry > 0) scratchSofa();
                    else wantToEat("scratch a sofa");
                    break;
                case 5:
                    if (isNotHungry > 0) washHimself();
                    else wantToEat("wash himself");
                    break;
            }
        }
    }
}
