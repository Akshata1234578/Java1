/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class TimeTable{
    int year;
    String[]day={"Mon","Teu","Wed","Thu","Fri","Sat"};
    int[]period={1,2,3,4,5,6,7};
    String[]batch={"4MW23CS","4MW23CS ","4MW22CS ","4MW21CS "};
    String[]subject={"OOPJ"};
    String[]faculty={"Kutyar Sir","Kutyar Sir","Chaitra Medam"};
    String[]sections={"A","B","C"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1){
        this.year=y1;
        this.section=s1;}
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println("TimeTable of Year"+heading+"Section"+section);}}
public class A12{
    public static void main(String[] args){
        TimeTable tt2A=new TimeTable(2," A ");
        TimeTable tt2B=new TimeTable(2," B ");
        tt2A.printTimeTable();
        tt2B.printTimeTable();}}
        
    
    

