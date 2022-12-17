package Java_8_practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Removing_duplicate {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,1,2,2,3,3,4,5,5};

        List<Integer> list = Arrays.asList(arr);

       Set<Integer> SetList = list.stream().collect(Collectors.toSet());

        System.out.println(SetList);

    }
}
