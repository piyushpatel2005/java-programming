import java.util.ArrayList;

public class TotalNumbers {
  public static void main(String[] args) {
    Number[] numbers = {1, 2.5, 4, 4.1};
    ArrayList<Number> numberList = new ArrayList<>();
    // It works with ArrayList<Number> doesn't mean that it will also work with ArrayList<Integer>.
    // that's where wildcards play an important role.

    for(Number element: numbers) {
      numberList.add(element);
    }

    System.out.printf("numberList contains: %s%n", numberList);
    System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
  }

  public static double sum(ArrayList<Number> list) {
    double total = 0;

    for(Number element: list)
      total += element.doubleValue();

    return total;
  }
}
