package Service;

import Modules.Cat;
import Modules.Eat;


public class CatService {
    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }

    public int eat(Eat eat) {
        if (cat.getAppetite() == cat.getSatiety()) {
            System.out.println("Кошка сыта " + cat.getSatiety());
            return cat.getAppetite();
        }
        if (cat.getAppetite() > eat.getCount()) {
            System.out.println("Кошка отказалась.");
            return cat.getSatiety();
        }
        while (cat.getAppetite() <= 10) {
            if (cat.getAppetite() == cat.getSatiety()) {
                System.out.println("Кошка сыта " + cat.getSatiety());
                return cat.getAppetite();
            }
            if (eat.getCount() < 1) {
                System.out.println("Еда закончилась!");
                return cat.getAppetite();
            }
            cat.setSatiety(cat.getSatiety() + 1);
            eat.decreaseCount();
        }
        return cat.getAppetite();
    }


}
