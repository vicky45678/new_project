package Java_8_practice_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_java8_program {

    public static void main(String[] args) {

        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee(101,"Rahul",102,"inactive",10000));
        emplist.add(new Employee(102,"vikalp",103,"active",20000));
        emplist.add(new Employee(103,"manish",104,"active",20000));
        emplist.add(new Employee(104,"abhishek",101,"inactive",40000));
        emplist.add(new Employee(105,"ashish",103,"active",10000));
        emplist.add(new Employee(106,"ashish chaudhari",104,"inactive",30000));
        emplist.add(new Employee(107,"anuj",102,"active",500000));

        // print emp based on department

        Map<Integer,List<Employee>> emplistbasedondep=emplist.stream()
                .collect(Collectors.groupingBy(Employee::getDepId));

        emplistbasedondep.entrySet().forEach(entry ->{
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        });

        //Q= print employee count working in each department

        Map<Integer, Long> empCountdept=emplist.stream().collect(Collectors.groupingBy
                (Employee::getDepId,Collectors.counting()));

        empCountdept.entrySet().forEach(entry->{
            System.out.println("dep"+entry.getKey()+"----"+entry.getValue());
        });



    }

}
