package Java_8_practice_Question;

public class Doctor {
    private int id;
    private String Name;
    private int salary;

    public Doctor(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Doctor[id="+id+",name"+Name+",salary"+salary+"]";
    }
}
