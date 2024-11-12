class Animal1{
    public void sound(){
        System.out.println("The animal makes a souns");
    }
}
class Dog1 extends Animal1{
    @Override
    public void sound(){
        System.out.println("the dog barks");
    }}
class Cat extends Animal1{
    @Override
    public void sound(){
        System.out.println("The cat meows");
    }}
public class A19{
    public static void main(String[] args){
        Animal1 animal=new Animal1();
        animal.sound();
        Dog1 dog=new Dog1();
        dog.sound();
        Cat cat=new Cat();
        cat.sound();
    }}

        
        
    
