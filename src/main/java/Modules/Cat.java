package Modules;

public class Cat {
    private String name;
    private int appetite;
    private int satiety = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void showCat() {
        System.out.println(name + ", аппетит " + appetite +", сытость: " + satiety + ".");;
    }
}
