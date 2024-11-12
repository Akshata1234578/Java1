class Vehicle{
    private String brand;
    public Vehicle(String brand){
        this.brand=brand;
    }
    
    public void displayBrand(){
        System.out.println("Brand: " +brand);
    }
}
interface Engine{
    void startEngine();
}
interface Transmission{
    void shiftGear();
    }
class Car extends Vehicle implements Engine,Transmission{

    public Car(String brand) {
        super(brand);
    }
    
    public void startEngine(){
        System.out.println("Engine is Started"); 
    }  
    public void shiftGear(){
        System.out.println("we are shifting gears");
    }
    }
public class A22{
    public static void main(String[] args){
        Car car1=new Car("Marithi");
        car1.startEngine();
        car1.shiftGear();
        
        
        
    }
}