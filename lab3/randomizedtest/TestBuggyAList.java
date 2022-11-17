package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  @Test
  public void randomizedTest(){
      AListNoResizing<Integer> correct = new AListNoResizing<>();
      BuggyAList<Integer> wrong = new BuggyAList<>();
      int N = 50000;
      for (int i = 0; i < N; i += 1) {
          int operationNumber = StdRandom.uniform(0, 4);
          if (operationNumber == 0) {
              // addLast
              int randVal = StdRandom.uniform(0, 100);
              correct.addLast(randVal);
              wrong.addLast(randVal);
              System.out.println("addLast(" + randVal + ")");
          } else if (operationNumber == 1) {
              // size
              int correct_size = correct.size();
              int buggy_size = wrong.size();
              System.out.println("size: " + correct_size);
              assertEquals(correct_size,buggy_size);
          } else if (operationNumber == 2){
              assertEquals(correct.size(),wrong.size());
              if(correct.size()>0){
                  int correct_last=correct.getLast();
                  int buggy_last = wrong.getLast();
                  System.out.println("getLast");
                  assertEquals(correct_last,buggy_last);
              }
          } else if (operationNumber == 3){
              assertEquals(correct.size(),wrong.size());
              if(correct.size()>0){
                  correct.removeLast();
                  wrong.removeLast();
                  System.out.println("removeLast");
              }
          }
      }
  }
}
