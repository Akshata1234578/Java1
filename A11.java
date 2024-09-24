/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;}
    
    public void getCarDetails(){
        System.out.println(color+""+make+"-"+model+""+year);}}
public class A11{
     public static void main(String[] args){
 Car principalCar=new Car("Hyunda ","i20 ",2022,"White ");
 Car vprincipalCar=new Car("Maruti ","Swift ",2020,"Grey ");
 System.out.println("The two car parked in front of SMVITM are");
 principalCar.getCarDetails();
 vprincipalCar.getCarDetails();}}
 
 
 
 



    
    
        
        
    
    
