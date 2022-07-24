package Pertemuan9;

public class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal{
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says: bow bow");
    }
}
