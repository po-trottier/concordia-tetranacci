public class MultipleRecursion {
  static long callsCounter;

  public static long Tetranacci(int n) {
    callsCounter++;

    if ((n == 0) || (n == 1) || (n == 2)) {
      return 0;
    } else if (n == 3) {
      return 1;
    }

    return Tetranacci(n - 1)
        + Tetranacci(n - 2)
        + Tetranacci(n - 3)
        + Tetranacci(n - 4);
  }
}
