// Problem Description

// Print the following pattern in output
// **********
// *        *
// *        *
// **********


// Problem Constraints

// No constraints


// Input Format

// No need to take input


// Output Format

// Print the following pattern in 4 lines, in which first and last line have 10 stars, 2nd and 3rd have 1 star 8 spaces and 1 star.
// **********
// *        *
// *        *
// **********


// Example Input

// No input required.


// Example Output

// Output :
// **********
// *        *
// *        *
// **********
import java.lang.*;
import java.util.*;

public class Q1_Beginner_Data_Types_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=4;i++)
        {
            switch(i)
            {
                case 1: System.out.println("**********");
                        break;
                case 2: System.out.println("*        *");
                        break;
                case 3: System.out.println("*        *");
                        break;
                case 4: System.out.println("**********");
                        break;
            }
        }
        
    }
}
