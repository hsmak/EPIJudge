package epi_judge_java.epi;
import epi_judge_java.epi.test_framework.EpiTest;
import epi_judge_java.epi.test_framework.GenericTest;
public class SnakeString {
  @EpiTest(testDataFile = "snake_string.tsv")

  public static String snakeString(String s) {
    // TODO - you fill in here.
    return "";
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SnakeString.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
