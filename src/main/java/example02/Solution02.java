/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE GOES HERE
    Basically write out step by step what ur codes doing.
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
