import Modules.Person;

public class HomeWork5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов", "ген. директор", "ivanov@mail.gov", 45);
        persArray[1] = new Person("Сидоров", "зам. диретора", "sidorov@mail.gov", 30);
        persArray[2] = new Person("Петров", "специалист", "petrov@mail.gov", 25);
        persArray[3] = new Person("Аносова", "гл. бухгалтер", "anosova@mail.gov", 33);
        persArray[4] = new Person("Рисковая", "сектертарь", "riskovaya@mail.gov", 41);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].showPerson();
            }
        }
    }
}