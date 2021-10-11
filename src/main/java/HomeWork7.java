import Modules.Cat;
import Modules.Eat;
import Modules.Plate;
import Service.CatService;

import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 1 + rand.nextInt(9);
        Cat[] catsArray = new Cat[5];
        Plate plate = new Plate(new Eat("мясо курицы ",count));

        catsArray[0] = new Cat("Мурзик", 2);
        catsArray[1] = new Cat("Барсик", 12);
        catsArray[2] = new Cat("Пушок", 5);
        catsArray[3] = new Cat("Зверь", 7);
        catsArray[4] = new Cat("Бим", 1);
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].showCat();
        }
        System.out.println("____________________________________________________________________________");


        System.out.println("В тарелке " + plate.getEat().getName() + plate.getEat().getCount() + " единиц");


        for (int i = 0; i < catsArray.length; i++) {
            CatService catService = new CatService(catsArray[i]);
            catService.eat(plate.getEat());
        }

        System.out.println("В тарелке осталось " + plate.getEat().getCount() + " единиц.");

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].showCat();
        }

        if (plate.isPlateEmpty() == false) {
            count = 1 + rand.nextInt(9 - plate.getEat().getCount());
            System.out.println("Положили еще мяса курицы " + count);
            plate.getEat().setCount(plate.getEat().getCount() + count);
        } else {
            count = 1 + rand.nextInt(9);
            System.out.println("Положили еще мяса курицы:" + count);//count);
            plate.getEat().setCount(plate.getEat().getCount() + count);//count);
        }

        System.out.println("____________________________________________________________________________");
        System.out.println("В тарелке " + plate.getEat().getName() + plate.getEat().getCount() + " единиц");

        for (int i = 0; i < catsArray.length; i++) {
            CatService catService = new CatService(catsArray[i]);
            catService.eat(plate.getEat());
        }

        System.out.println("В тарелке осталось " + plate.getEat().getCount() + " единиц.");

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].showCat();
        }
    }
}
