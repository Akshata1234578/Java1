package pkg;
import pkg2.MyPackage2;
import pkg2.MyPackage3;
public class A10{

        public static void main(String[] args) {
                System.out.println("Package");
                MyPackage2 mypack1=new MyPackage2();
                mypack1.display();
                MyPackage3 mp3 = new MyPackage3();
                mp3.display();
                
        }
}




