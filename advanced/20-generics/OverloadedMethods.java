public class OverloadedMethods {
  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4,5};
    Character[] charArray = {'a', 'b', 'c', 'd', 'e'};

    System.out.printf("Array intArray contains: %n");
    printArray(intArray);
    System.out.printf("Array charArray contains: %n");
    printArray(charArray);
  }

  public static void printArray(Integer[] inputArray) {
    for(Integer element: inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static void printArray(Character[] inputArray) {
    for(Character element: inputArray)
      System.out.printf("%s ", element);
    System.out.println();
  }
}
