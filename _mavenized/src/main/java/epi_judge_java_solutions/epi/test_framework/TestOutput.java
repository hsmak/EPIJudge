
package epi_judge_java_solutions.epi.test_framework;

import java.util.List;

public class TestOutput {
  public TestTimer timer;
  List<Integer> metrics;

  public TestOutput(TestTimer timer, List<Integer> metrics) {
    this.timer = timer;
    this.metrics = metrics;
  }
}
