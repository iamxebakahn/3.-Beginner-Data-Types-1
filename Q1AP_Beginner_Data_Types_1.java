// Problem Description

// Print the following pattern in output
//  *
// * *
//  *


// Problem Constraints

// No constraints


// Input Format

// No need to take input.


// Output Format

// Print the following pattern in 3 lines, in which first and last line has 1 spaces and then 1 star, and middle line has 1 star 1 space and 1 star.
//  *
// * *
//  *


// Example Input

// No input required.


// Example Output

// Output :
//  *
// * *
//  *
import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_Data_Types_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for (int i=1;i<=3;i++)
        {
            if((i==1)||(i==3))
                System.out.println(" *");
            else if(i==2)
                System.out.println("* *");
        }
    }
}
