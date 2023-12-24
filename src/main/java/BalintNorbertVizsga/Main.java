package BalintNorbertVizsga;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Blöki");
        System.out.println(dog.name +" mondja: ");
        dog.makeSound();

        System.out.println("----------------");

        Cat cat = new Cat("Cicus");
        System.out.println(cat.name +" mondja: ");
        cat.makeSound();

    }
}
