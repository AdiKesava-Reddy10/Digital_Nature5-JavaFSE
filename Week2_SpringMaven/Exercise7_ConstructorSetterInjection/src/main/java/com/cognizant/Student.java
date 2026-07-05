package com.cognizant;
public class Student {
    int id; String name;
    Student(){}
    Student(int id,String name){this.id=id;this.name=name;}
    public static void main(String[] args){
        Student s1=new Student(101,"Adi");
        Student s2=new Student();
        s2.id=102; s2.name="Kesava";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}