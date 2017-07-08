public class GenericMethod {
  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Character[] charArray = {'a', 'b' , 'c', 'd', 'e'};

    System.out.println("intArray contains: ");
    printArray(intArray);
    System.out.println("charArray contains: ");
    printArray(charArray);
  }

  public static <T> void printArray(T[] inputArray) {
    for(T elem: inputArray)
      System.out.printf("%s ", elem);
    System.out.println();
  }
}
