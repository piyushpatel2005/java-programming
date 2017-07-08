import java.util.ArrayList;

public class WildCard {
  public static void main(String[] args) {
    Integer[] integers = {1, 2, 3, 4, 5};
    ArrayList<Integer> intList = new ArrayList<> ();

    for(Integer elem: integers)
      intList.add(elem);

    System.out.printf("intList contains: %s%n", intList);
    System.out.printf("Total of the elements in intList: %.1f%n%n", sum(intList));

    Double[] doubles = {1.1, 3.3, 5.5};
    ArrayList<Double> doubleList = new ArrayList<> ();

    for(Double elem: doubles)
      doubleList.add(elem);

    System.out.printf("doubleList contains: %s%n", doubleList);
    System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));

    Number[] numbers = {1, 2.4, 3, 4.1};
    ArrayList<Number> numberList = new ArrayList<>();

    for(Number elem: numbers)
      numberList.add(elem);

    System.out.printf("numberList contains: %s%n", numberList);
    System.out.printf("Total of the elements in the numberList: %.1f%n%n", sum(numberList));
  }

  public static double sum(ArrayList<? extends Number> list) {
    double total = 0;

    for(Number elem: list)
      total += elem.doubleValue();

    return total;
  }
}
