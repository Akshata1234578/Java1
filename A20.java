class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking");
    }
}
public class A20{
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}