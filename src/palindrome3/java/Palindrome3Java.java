/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome3.java;

import javax.swing.*;
/**
 *
 * @author kamac8665
 */
public class Palindrome3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String originalWord, word, backwardsWord, palindromes = "";
        int spacePos, pos, palCounter = 0;

        //get the word from the user
        originalWord = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase(do not include a punctuation mark):");


        //remove the spaces from the sentence
        word = originalWord.replaceAll(" ", "");

        //Reverse the sentence
        backwardsWord = "";
        for (pos = word.length() - 1; pos >= 0; pos--) {
            backwardsWord += word.charAt(pos);
        }

        //Compare the words
        if (word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, originalWord + " IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, originalWord + " IS NOT a palindrome.");
        }
    }
}
