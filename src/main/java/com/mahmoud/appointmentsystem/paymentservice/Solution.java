package com.mahmoud.appointmentsystem.paymentservice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();

        // Create an ArrayList of ArrayLists to store the lines of integers
        List<List<Integer>> lines = new ArrayList<>();

        // Populate the lines
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Number of integers in the current line
            List<Integer> currentLine = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                currentLine.add(scanner.nextInt());
            }
            lines.add(currentLine);
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int k = 0; k < q; k++) {
            int x = scanner.nextInt(); // Line number (1-indexed)
            int y = scanner.nextInt(); // Position in the line (1-indexed)

            try {
                // Access the element in the specified line and position
                // Adjust for 0-indexed ArrayLists
                System.out.println(lines.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                // Handle cases where the line or position is out of bounds
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
