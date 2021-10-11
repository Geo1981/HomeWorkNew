package Modules;

public class Plate {
    private Eat food;

    public Plate(Eat food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void addEat(Eat eat) {
        this.food = food;
    }

    public boolean isPlateEmpty() {
        return this.food.getCount() < 1;
    }

    public Eat getEat() {
        return food;
    }

}