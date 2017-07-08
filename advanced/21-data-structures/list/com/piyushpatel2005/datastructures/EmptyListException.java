package com.piyushpatel2005.datastructures;

public class EmptyListException extends RuntimeException {
  public EmptyListException () {
    this("list");
  }

  public EmptyListException(String name) {
    super(name + " is empty");
  }
}
