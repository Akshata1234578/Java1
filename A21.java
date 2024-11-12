class Student1{
    String name;
    int age;
    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
}
public class A21{
public static void main(String[] args){
    Student1 student1=new Student1("Akshata",18);
    Student1 student2=new Student1("Sanvi",19);
    System.out.println("Student 1 Information:");
    student1.displayInfo();
    System.out.println("\nStudent 2 Information:");
    student2.displayInfo();
}}
    
   


