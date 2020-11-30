package AccessModifiers;

import OutsideOfPackage.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getDogName());

        Potato potato = new Potato();
        potato.getName();
    }
}
