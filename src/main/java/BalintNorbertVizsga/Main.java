package BalintNorbertVizsga;

public class Main {
    public static void main(String[] args) {

        String separator = "--------------";

        Dog dog = new Dog("Blöki");
        System.out.println(dog.name +" mondja: ");
        dog.makeSound();

        System.out.println(separator);

        Cat cat = new Cat("Cicus");
        System.out.println(cat.name +" mondja: ");
        cat.makeSound();

        System.out.println(separator);

        Dog dog2 = new Dog("Dió");
        System.out.println(dog2.name +" mondja: ");
        dog2.makeSound();

        System.out.println(separator);;

        Cat cat2 = new Cat("Cicus");
        System.out.println(cat2.name +" mondja: ");
        cat2.makeSound();

    }
}
