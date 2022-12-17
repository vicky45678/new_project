package polymorphism_practice_java;

public class Polymorphism {
    public static void main(String[] args) {
       //it is runetime polymorphishm
        Dog_Animal d =new Dog_Animal();
        Pet_animal p=d;
        Animal a=d;
        d.walk();
        p.walk();

        // it is compile time polymorphism
        //same method main ham ise call ni kr skte jab tab ham ise alag alag parameter ni denge

        //multiple behaviour hoga par different parameter main
        //compile time
        greeting("vicky",5);
    }
    public static void greeting(){
        System.out.println("hai , there");
    }
    //isme same m,ethod wordk ni krega jab tab ham ise kuch different argument ni denge
    public static void greeting(String s){
        System.out.println(s);
    }
    public static void greeting(String s, int count){
        for (int i=0; i<count; i++){
            System.out.println(s);
        }
    }
}
       //it is runtime polymorphishm
       //compile time polymorphishm main hame pahle hi pta chl jata hai ki konsa wala call ho rha hai