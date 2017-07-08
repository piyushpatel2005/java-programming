public class RawTypeTest {
  public static void main(String[] args) {
    Double[] doubleElements = {1.1, 2.2, 3.3};
    Integer[] intElements = {1, 2, 3, 4, 5};

    Stack rawTypeStack1 = new Stack(5);
    Stack rawTypeStack2 = new Stack<Double>(5);
    Stack<Integer> intStack = new Stack(10);

    testPush("rawTypeStack1", rawTypeStack1, doubleElements);
    testPop("rawTypeStack1", rawTypeStack1);

    testPush("rawTypeStack2", rawTypeStack2, doubleElements);
    testPop("rawTypeStack2", rawTypeStack2);

    testPush("intStack", intStack, intElements);
    testPop("intStack", intStack);
  }

  public static <T> void testPush(String name, Stack<T> stack, T[] elements) {
    System.out.printf("%nPushing elements onto %s%n", name);

    for(T element: elements) {
      System.out.printf("%s ", element);
      stack.push(element);
    }
  }

  public static <T> void testPop(String name, Stack<T> stack) {
    try {
      System.out.printf("%nPopping elements from %s%n", name);
      T popValue;

      while(true) {
        popValue = stack.pop();
        System.out.printf("%s ", popValue);
      }
    }
    catch(EmptyStackException emptyStackException) {
      System.out.println();
      emptyStackException.printStackTrace();
    }
  }
}
