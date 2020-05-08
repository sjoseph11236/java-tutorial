import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main  { 
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("Dog", "Cat", "Hamster");

    List<String> filteredList = strings.stream().filter( (String animal) -> animal.charAt(0) == 'H').collect(Collectors.toList());
    System.out.println(filteredList);
  }
}