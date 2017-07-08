import com.piyushpatel2005.datastructures.Tree;
import java.util.Random;


public class TreeTest {
  public static void main(String[] args) {
    Tree<Integer> tree = new Tree<Integer> ();
    int value;
    Random randomNumber = new Random();

    System.out.println("Inserting the following values: ");

    for(int i = 1; i <= 10; i++) {
      value = randomNumber.nextInt(100);
      System.out.printf("%d ", value);
      tree.insertNode(value);
    }

    System.out.println("\n\nPreorder Traversal");
    tree.preorderTraversal();

    System.out.println("\n\nInorder Traversal");
    tree.inorderTraversal();

    System.out.println("\n\nPostorder Traversal");
    tree.postorderTraversal();
    System.out.println();
  }
}
