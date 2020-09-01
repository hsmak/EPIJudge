
package epi_judge_java_solutions.epi;

import epi_judge_java_solutions.epi.test_framework.EpiTest;
import epi_judge_java_solutions.epi.test_framework.GenericTest;

public class ReverseList {
  @EpiTest(testDataFile = "reverse_list.tsv")

  public static ListNode<Integer> reverseList(ListNode<Integer> head) {
    ListNode<Integer> prev = null, curr = head;
    while (curr != null) {
      ListNode<Integer> temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "ReverseList.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
