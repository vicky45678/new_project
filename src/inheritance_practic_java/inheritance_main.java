package inheritance_practic_java;


/*inheritance is a relationship. we use inheritance only if an is a relationship is present
 between the two class.
 here are some example.
 1 a car is a vehicle.
 2 orange is a fruit.
 3 a surgeon is a doctor.
 4 a dog is an animal.
 */
public class inheritance_main {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="Mr vicky";
        t.eat();
        t.walk();
        t.teach();

        Singer s=new Singer();
        s.name="oprah";
        s.sing();
        s.eat();

    }
}
