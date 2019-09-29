// PSEUDOCODE:
// Algorithm Tetranacci(n, A)
//    Inputs: The number of terms "n" to calculate & the Array A containing the last 4 numbers of the series
//    Output: An array container the last 4 numbers of the series
//
//    if n < 4 do
//        return A
//    else
//        sum = A[0] + A[1] + A[2] + A[3]
//        A[0] <- A[1]
//        A[1] <- A[2]
//        A[2] <- A[3]
//        A[3] <- sum
//        return Tetranacci(n - 1, A)

class LinearTailRecursion {
  static int callsCounter = 0;

  // Redirection function used to simplify the use
  static long[] Tetranacci(int n) {
    // Initial array required for Tail Recursion
    long[] A = {0, 0, 0, 1};
    return TetranacciRecursion(n, A);
  }

  // Function containing the actual tail recursion logic
  static long[] TetranacciRecursion(int n, long[] A) {
    // Increase the executions called counter by 1
    callsCounter++;
    // Stopping Cases
    if (n < 4) {
      return A;
    }
    else {
      // Store sum of all the elements
      long sum = A[0] + A[1] + A[2] + A[3];
      // Shift every element down 1 position
      A[0] = A[1];
      A[1] = A[2];
      A[2] = A[3];
      // Fill the last element with the sum of all
      // the number previously present in the array
      A[3] = sum;
      // Print the element
      System.out.print(A[3] + " ");
      // Recursively calls itself until n < 4
      return TetranacciRecursion(n - 1, A);
    }
  }
}
