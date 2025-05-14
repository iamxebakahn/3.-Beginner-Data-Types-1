// Problem Description

// Print first five multiples of 3 in the following manner -
// 3*1 = 3
// 3*2 = 6
// 3*3 = 9
// 3*4 = 12
// 3*5 = 15


// Problem Constraints

// No constraints.


// Input Format

// No need to take input.


// Output Format

// Print output in 5 lines.
// In 1st line : 3*1 = 3
// In 2nd line : 3*2 = 6
// In 3rd line : 3*3 = 9
// In 4th line : 3*4 = 12
// In 5th line : 3*5 = 15


// Example Input

// No input required.


// Example Output

// Output :
// 3*1 = 3
// 3*2 = 6
// 3*3 = 9
// 3*4 = 12
// 3*5 = 15
import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Data_Types_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        for (int i=1;i<=5;i++)
        {
            System.out.println("3*"+i+" = "+(3*i));
        }
        
    }
}
