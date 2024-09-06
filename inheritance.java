public class inheritance {
    public static void main(String[] args) {
        Fish Shark= new Fish();
        Shark.eat();
    }
}

//base class~~~~~~~
class Animal{
    String Color;
    void eat(){
        System.out.println("eats");
    }
    void Breathe(){
        System.out.println("breathes");
    }

}

//derived class

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
