package org.piyushpatel2005.functional;


@FunctionalInterface
public interface Predicate<T> {
     boolean test (T t);

     default Predicate<T> and(Predicate<T> other) {
          return t -> test(t) && other.test(t);
     }

     default Predicate<T> or(Predicate<T> other) {
          return t -> test(t) || other.test(t);
     }

     static<U> Predicate<U> isEqualsTo(U other) {
          return s -> s.equals(other);
     }
}
