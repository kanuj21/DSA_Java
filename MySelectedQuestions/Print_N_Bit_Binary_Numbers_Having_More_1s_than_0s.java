//package MySelectedQuestions;

import java.util.ArrayList;
/*
 * ***********************Question discription**********************
 * Given a positive integer n. Your task is to generate a string list 
 * of all n-bit binary numbers where, for any prefix of the number, 
 * there are more or an equal number of 1's than 0's. The numbers should 
 * be sorted in decreasing order of magnitude.
 * 
 * ***************************Question Link***************************
 * https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1
 */

/**
 * Print_N_Bit_Binary_Numbers_Having_More_1s_than_0s
 */
public class Print_N_Bit_Binary_Numbers_Having_More_1s_than_0s {

    static ArrayList<String> res;//declair ArrayList of String that will hold all n bits Binary and we shall return finaly it

    /* main solution method that is calling from main method Or driver code*/
    static ArrayList<String> NBitBinary(int N) {
        // code here
        res = new ArrayList<>();//Initialize our res ArrayList

        String str = ""; //take an empty string that will hold curr binary bits during recursion calls

        sol(str, N, 0, 0); //call our solution method which recursive function
        
        return res; // finally after recursion return "res" arrayList of string to main method

    }
    
    
    private static void sol(String str, int N,  int zero, int one){
        
        //if str length is equal to given N-Bit then add it to res list

        if(str.length() == N){
            res.add(str);
            return;
        }
        
        //append "1" into str and call next for binary bit
        
        sol(str + "1", N, zero, one + 1);
        
        //check if number of 0 is equal to one then it will break rule of more 1 than 0. So if zero is equal to one, dont go with another 0
        
        if(zero < one){
            
            sol(str + "0", N, zero + 1, one);
        }
            
    }
    
    public static void main(String[] args) {
        int n = 4;
        ArrayList<String> result = new ArrayList<>();
        result = NBitBinary(n);

        for(String binary : result)
            System.out.print(binary + " ");
    }
}

/**
 *  Solution
 */
