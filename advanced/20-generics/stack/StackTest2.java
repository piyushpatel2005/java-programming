public class StackTest2 {
  public static void main(String[] args) {
    Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    Integer[] intElements = {1, 2, 3, 4, 5, 6};

    Stack<Double> doubleStack = new Stack<> (5);
    Stack<Integer> intStack = new Stack<>();

    testPush("doubleStack", doubleStack, doubleElements);
    testPop("doubleStack", doubleStack);

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
