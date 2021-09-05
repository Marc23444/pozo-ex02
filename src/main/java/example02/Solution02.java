/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE
    -Create a way for the user to input a string (Use a scanner) and a way to store the number of chars
    -Prompt the user for an input string
    -Take in the users input, using that input calculate the number of characters within it
        -Use .length()
    -Print the string and how many characters it has
 */

package example02;

import java.util.Scanner;

public class Solution02 {


    public static void main(String[] args)
    {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the input string?");
        String word = scan.nextLine();

        num = word.length();

        System.out.println(word + " has "+num+" characters.");
    }
}
