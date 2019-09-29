// IMPORTANT INFORMATION:

// Written by:
// Pierre-Olivier Trottier (40059235)
// Nimit Jaggi (40032159)

// SEE THE FILE "Observations.txt" IN THE ROOT OF THE PROJECT FOR
// OUR OBSERVATIONS OF THE RESULTS.

// SEE THE FILES "OutLinear.txt", "OutLinearTail.txt" and
// "OutMultiple.txt" IN THE ROOT OF THE PROJECT FOR THE
// IMPLEMENTED ALGORITHM's OUTPUTS.

// THE PSEUDOCODE FOR BOTH ALGORITHMS IS LOCATED ABOVE
// THE RESPECTIVE CLASSES

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
  private static Scanner in = new Scanner(System.in);

  // Execution function for the Linear Algorithm
  private static void runLinearAlgorithm(int x) {
    System.out.println("Getting the Tetranacci sequence for n = " + x);
    // Reset the Call Counter before every execution
    LinearRecursion.callsCounter = 0;
    // Get the time in Nano Seconds before the Algorithm is executed
    long startTime = System.nanoTime();
    // Execute the Algorithm
    long[] A = LinearRecursion.Tetranacci(x);
    // Get the time in Nano Seconds after the Algorithm was executed
    long endTime = System.nanoTime();
    // Get the time time difference (Time Elapsed)
    long timeElapsed = endTime - startTime;
    // Output the results
    System.out.println("\nThe value for Tetranacci(" + x + ") is: " + A[3]);
    System.out.println("The function was called " + LinearRecursion.callsCounter + " times.");
    System.out.println("The function executed in " + timeElapsed + " ns.");
  }

  // Execution function for the Linear Algorithm
  private static void runLinearTailAlgorithm(int x) {
    System.out.println("Getting the Tetranacci sequence for n = " + x);
    // Reset the Call Counter before every execution
    LinearTailRecursion.callsCounter = 0;
    // Get the time in Nano Seconds before the Algorithm is executed
    long startTime = System.nanoTime();
    // Execute the Algorithm
    long[] A = LinearTailRecursion.Tetranacci(x);
    // Get the time in Nano Seconds after the Algorithm was executed
    long endTime = System.nanoTime();
    // Get the time time difference (Time Elapsed)
    long timeElapsed = endTime - startTime;
    // Output the results
    System.out.println("\nThe value for Tetranacci(" + x + ") is: " + A[3]);
    System.out.println("The function was called " + LinearTailRecursion.callsCounter + " times.");
    System.out.println("The function executed in " + timeElapsed + " ns.");
  }

  private static void runMultipleAlgorithm(int x) {
    System.out.println("Getting the Tetranacci sequence for n = " + x);
    // Reset the Call Counter before every execution
    MultipleRecursion.callsCounter = 0;
    // Get the time in Nano Seconds before the Algorithm is executed
    long startTime = System.nanoTime();
    // Execute the Algorithm
    long A = MultipleRecursion.Tetranacci(x);
    // Get the time in Nano Seconds after the Algorithm was executed
    long endTime = System.nanoTime();
    // Get the time time difference (Time Elapsed)
    long timeElapsed = endTime - startTime;
    // Output the results
    System.out.println("The value for Tetranacci(" + x + ") is: " + A);
    System.out.println("The function was called " + MultipleRecursion.callsCounter + " times.");
    System.out.println("The function executed in " + timeElapsed + " ns.");
  }

  private static void redirectConsoleOutput(String file) {
    PrintStream fileOut = null;
    try {
      fileOut = new PrintStream("./" + file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    System.setOut(fileOut);
  }

  public static void main(String[] args) {
    // EXECUTE THE LINEAR RECURSION ALGORITHM

    // Redirect Console Output to OutLinear.txt
    // This code was disabled to avoid overwriting the previously obtained results
    // redirectConsoleOutput("OutLinear.txt");

    // Start the execution of the algorithms
    System.out.println("Running the Linear Recursive Algorithm");
    System.out.println("----------------------------------------\n");

    // Run the Linear algorithm for n = 5, n = 10, n = 15, n = 20, etc.
    for(int i = 5; i <= 100; i += 5) {
      runLinearAlgorithm(i);
      System.out.println("");
    }

    // EXECUTE THE LINEAR TAIL RECURSION ALGORITHM (Because of Part C)

    // Redirect Console Output to OutLinearTail.txt
    // This code was disabled to avoid overwriting the previously obtained results
    // redirectConsoleOutput("OutLinearTail.txt");

    System.out.println("Running the Linear Tail Recursive Algorithm");
    System.out.println("--------------------------------------------\n");

    // Run the linear tail algorithm for n = 5, n = 10, n = 15, n = 20, etc.
    for(int i = 5; i <= 100; i += 5) {
      runLinearTailAlgorithm(i);
      System.out.println("");
    }

    // EXECUTE THE MULTIPLE RECURSION ALGORITHM

    // Redirect Console Output to OutMultiple.txt
    // This code was disabled to avoid overwriting the previously obtained results
    // redirectConsoleOutput("OutMultiple.txt");

    System.out.println("Running the Multiple Recursive Algorithm");
    System.out.println("-----------------------------------------\n");

    // Run the multiple algorithm for n = 5, n = 10, n = 15, n = 20, etc.
    for(int i = 5; i <= 100; i += 5) {
      runMultipleAlgorithm(i);
      System.out.println("");
    }
  }
}
