package model;

public class Kotik {
    private static int kotikCount = 0;

    private String name;
    private double weight;
    private int satietyLevel; // 0 - чем ближе к нулю, тем кот голоднее
    private String meow;

    // конструктор объекта без параметров:
    public Kotik() {
        encreaseCounter();
    }

    // конструктор объекта с параметрами:
    public Kotik(String name, double weight, String meow) {
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satietyLevel = (int) (Math.random() * 10); // степень голода устанавливается случайным числом от 0 до 10
        encreaseCounter();
    }

    // сеттеры и геттеры:
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSatietyLevel(int setSatietyLevel) {
        this.satietyLevel = setSatietyLevel;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public String getMeow() {
        return meow;
    }

    public static int getCounter() {
        return kotikCount;
    }

    public void printNewCatInfo() {
        System.out.println("We have new cat here! His name is " + name + ", he weights " + weight + " kg, he is satisfied (not hungry) for " + satietyLevel + ".");
    }

    // 5 дел для распорядка дня:
    public void play() {
        System.out.println(name + " is playing with toys.");
        satietyLevel--;
    }

    public void sleep() {
        System.out.println(name + " is sleeping now.");
        satietyLevel--;
    }

    public void chaseMouse() {
        System.out.println(name + " is chasing the mouse.");
        satietyLevel--;
    }

    public void scratchSofa() {
        System.out.println(name + " is scratching the sofa.");
        satietyLevel--;
    }

    public void washHimself() {
        System.out.println(name + " is washing himself.");
        satietyLevel--;
    }

    // 3 перегруженных метода для кормления:
   public void eat() {
        eat(1 + (int) (Math.random() * 5), "Sheba"); // покормить кота на 1-5 единиц
    }
    
    public void eat(int satietyLevel) {
        eat(satietyLevel, "Sheba");
    }
    
    public void eat(int satietyLevel, String meal) {
        this.satietyLevel += satietyLevel;
        System.out.println("He took his meal \"" + meal + "\" and now is satisfied for " + satietyLevel + ".");
    }
    
    public void liveAnotherDay() {
        for (int hour = 0; hour < 24; hour++) {
            String currentHour = String.format("%02d", hour);
            int caseRandom = 1 + (int) (Math.random() * 5);
            System.out.print(currentHour + ":00 ");
            switch (caseRandom) {
                case 1:
                    if (satietyLevel > 0) play();
                    else printHungryCatMessage("play");
                    break;
                case 2:
                    if (satietyLevel > 0) sleep();
                    else printHungryCatMessage("sleep");
                    break;
                case 3:
                    if (satietyLevel > 0) chaseMouse();
                    else printHungryCatMessage("chase a mouse");
                    break;
                case 4:
                    if (satietyLevel > 0) scratchSofa();
                    else printHungryCatMessage("scratch a sofa");
                    break;
                case 5:
                    if (satietyLevel > 0) washHimself();
                    else printHungryCatMessage("wash himself");
                    break;
            }
        }
    }

    private static void encreaseCounter() {
        kotikCount++;
    }

    // вывод сообщения о голодном коте:
    private void printHungryCatMessage(String action) {
        System.out.print(name + " doesn't want to " + action + ", because he is hungry! ");
        eat();
    }
}
