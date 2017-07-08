import com.piyushpatel2005.datastructures.Queue;
import com.piyushpatel2005.datastructures.EmptyListException;


public class QueueTest {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<Integer>();

    queue.enqueue(-1);
    queue.print();
    queue.enqueue(0);
    queue.print();

    queue.enqueue(1);
    que ue.print();
    queue.enqueue(5);
    queue.print();

    try {
      int removedItem;

      while(true) {
        removedItem = queue.dequeue();
        System.out.printf("%n%d dequeued%n", removedItem);
        queue.print();
      }
    }
    catch(EmptyListException emptyListException) {
      emptyListException.printStackTrace();
    }
  }
}
