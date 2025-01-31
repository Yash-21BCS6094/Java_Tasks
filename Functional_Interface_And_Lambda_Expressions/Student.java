package Functional_Interface_And_Lambda_Expressions;

public class Student {
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    int getId(){
        return this.id;
    }
}
