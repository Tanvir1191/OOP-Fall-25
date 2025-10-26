abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars!");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger growls!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}

Animaleinterfacedemo.jva
interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class AnimalInterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
