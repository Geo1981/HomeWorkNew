package Modules;

public class Person {
    private String fullName;
    private String position;
    private String email;
    public int age;

    public Person(String fullName, String position, String email, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.age = age;
    }

    public void showPerson() {
        System.out.println("Сотрудик. ФИО: " + fullName + ", должность: " + position + ", email: " + email + ", возраст: " + age + ".");
    }

    public int getAge() {
        return age;
    }
}