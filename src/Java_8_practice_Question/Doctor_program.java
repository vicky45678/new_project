package Java_8_practice_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Doctor_program {
    public static void main(String[] args) {

        List<Doctor> doc = new ArrayList<>();
        doc.add(new Doctor(101,"Sharma shakya",10000));
        doc.add(new Doctor(102,"Sharma singh",20000));
        doc.add(new Doctor(103,"Sharma kumar",30000));
        doc.add(new Doctor(104,"Sharma ji",10000));

       // Map<Integer,Long> newdoc= doc.stream().collect(Collectors.groupingBy(Doctor.));

    }
}
