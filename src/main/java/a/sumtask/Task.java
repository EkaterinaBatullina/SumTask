/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.sumtask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ekaterina
 */
public class Task {
    private int[] weight = new int[0];
    private int sum;
    
    public Task(int[] weight, int sum) {
        
        this.weight = weight;
        this.sum = sum;
        
    }
    
     public List<Integer> findSubset() {
    
        int length = weight.length;
        boolean[][] subsetArray = new boolean[length + 1][sum + 1];
 
        for (int i = 0; i <= length; i++) {
            subsetArray[i][0] = true;
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= sum; j++) {

                if (weight[i - 1] > j) {
                     subsetArray[i][j] =  subsetArray[i - 1][j];
                } 
                else {
                     subsetArray[i][j] =  subsetArray[i - 1][j] ||  subsetArray[i - 1][j - weight[i - 1]];
                }
            }
        }

        if (! subsetArray[length][sum]) {
            return new ArrayList<>();
        }

        List<Integer> subset = new ArrayList<>();
        int i = length;
        int j = sum;
        while (i > 0 && j > 0) {
       
            if (subsetArray[i][j] && !subsetArray[i - 1][j]) {
                subset.add(weight[i - 1]);
                j -= weight[i - 1];
            }
            i--;
        }

        return subset;
    }
}
