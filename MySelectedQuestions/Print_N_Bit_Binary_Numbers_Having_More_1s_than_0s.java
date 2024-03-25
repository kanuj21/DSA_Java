//package MySelectedQuestions;

import java.util.ArrayList;

/**
 * Print_N_Bit_Binary_Numbers_Having_More_1s_than_0s
 */
public class Print_N_Bit_Binary_Numbers_Having_More_1s_than_0s {

    static ArrayList<String> res;
    static ArrayList<String> NBitBinary(int N) {
        // code here
        res = new ArrayList<>();
        String str = "";
        sol(str, N, 0, 0);
        
        return res;
    }
    
    
    private static void sol(String str, int N,  int zero, int one){
        
        if(str.length() == N){
            res.add(str);
            return;
        }
        
        sol(str + "1", N, zero, one + 1);
        
        
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
