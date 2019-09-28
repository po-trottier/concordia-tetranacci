// PSEUDOCODE:
// Algorithm Tetranacci(n)
//    Input: The number of terms "n" to calculate
//    Output: An array container the last 4 numbers of the series
//
//    if n == 0
//        return [0, 0, 0, 0]
//    if n == 1
//        return [0, 0, 0, 0]
//    if n == 2
//        return [0, 0, 0, 0]
//    if n == 3
//        return [0, 0, 0, 1]
//    else
//        A = Tetranacci(n - 1)
//        w = A[0]
//        x = A[1]
//        y = A[2]
//        z = A[3]
//        A[0] <- x
//        A[1] <- y
//        A[2] <- z
//        A[3] <- w + x + y + z
//        return A

class LinearRecursion {
  static int callsCounter = 0;

  static long[] Tetranacci(int n) {
    // Increase the executions called counter by 1
    callsCounter++;

    // Allocate space for the array storing the 4 last values
    long[] A = new long[4];

    if (n == 0) {
      A = new long[] {0, 0, 0, 0};  // A = [0, 0, 0, 0]
      System.out.print(A[3]);
      return A;
    }
    if (n == 1) {
      A = new long[] {0, 0, 0, 0};  // A = [0, 0, 0, 0]
      System.out.print(A[2] + " " +  A[3]);
      return A;
    }
    if (n == 2) {
      A = new long[] {0, 0, 0, 0};  // A = [0, 0, 0, 0]
      System.out.print(A[1] + " " +  A[2] + " " +  A[3]);
      return A;
    }
    if (n == 3) {
      A = new long[] {0, 0, 0, 1};  // A = [0, 0, 0, 1]
      System.out.print(A[0] + " " + A[1] + " " +  A[2] + " " +  A[3]);
      return A;
    }
    else {
      // Recursively calls itself until n == 3
      A = Tetranacci(n - 1);
      // Store the first element of the array in a temporary variable
      long w = A[0];
      // Shift every element down 1 position
      A[0] = A[1];
      A[1] = A[2];
      A[2] = A[3];
      // Fill the last element with the sum of all
      // the number previously present in the array
      A[3] = w + A[0] + A[1] + A[2];
      System.out.print(" " + A[3]);
      return A;
    }
  }
}
