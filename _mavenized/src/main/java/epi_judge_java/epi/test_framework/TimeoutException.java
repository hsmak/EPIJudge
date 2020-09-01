
package epi_judge_java.epi.test_framework;

public class TimeoutException extends Exception {
  private TestTimer timer;

  TimeoutException(long timeoutSeconds) {
    timer = new TestTimer(timeoutSeconds);
  }

  TestTimer getTimer() { return timer; }
}
