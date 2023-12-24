package BalintNorbertVizsga;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
    };


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
