package polymorphism_practice_java;

public class Dog_Animal extends Pet_animal{
    public void walk(){
        //variable we can not override but we can only method override
        System.out.println("dog is walking");
    }
}
