// PSEUDOCODE:
// Algorithm Tetranacci(n)
//    Input: The number of terms "n" to calculate 
//    Output: The tetranacci number for n
//
//    if n < 3 do
//        return 0
//    else if n == 3 do
//        return 1
//    else 
//        return Tetranacci(n - 1) + Tetranacci(n - 2) + Tetranacci(n - 3) + Tetranacci(n - 4);
//      
//     


public class MultipleRecursion {
  static long callsCounter;

  public static long Tetranacci(int n) {
    callsCounter++;

    // There are two stopping cases:
    // 1. n < 3
    // 2. n == 3

    // If n < 3 then the value returned is 0
    if ((n == 0) || (n == 1) || (n == 2)) {
      return 0; 
    // If n == 3 then the value returned is 1
    } else if (n == 3) {
      return 1;
    }

    // Recursive case: Calculate the sum of the 4 previous numbers
    return Tetranacci(n - 1)
        + Tetranacci(n - 2)
        + Tetranacci(n - 3)
        + Tetranacci(n - 4);
  }
}
