package StreamAPI1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Filter even numbers and print them
    List<Integer> evenNumbers = numbers.stream()
                                       .filter(n -> n % 2 ==0)
                                       .collect(Collectors.toList());  
    
    System.out.println("Even Numbers: " + evenNumbers);
}

}