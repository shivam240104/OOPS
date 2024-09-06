public class inheritance {
    public static void main(String[] args) {
        Fish Shark= new Fish();
        Shark.eat();

        Dog rock=new Dog();
        rock.eat();
        rock.legs=4;
        System.out.println(rock.legs);
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
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

//multi level inheritance
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
