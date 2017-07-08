package com.piyushpatel2005.datastructures;
// Composition prevents access to some additional methods from List<T>
// With inheritance all methods are accessisble to StackIneritance objects.


public class StackComposition {
  private List<T> stackList;

  public StackComposition() {
    stackList = new List<T>("stack");
  }

  public void push(T object) {
    stackList.insertAtFront(object);
  }

  public T pop() throws EmptyListException {
    return stackList.removeFromFront();
  }

  public boolean isEmpty() {
    return stackList.isEmpty();
  }

  public void print() {
    stackList.print();
  }
}
