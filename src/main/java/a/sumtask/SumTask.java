/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.sumtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author ekaterina
 */
public class SumTask {

    public static void main(String[] args) {
        
        Task task = new Task(new int[]{3, 34, 4, 12, 5, 2}, 9);
        List<Integer> subset = task.findSubset();
        if (subset.isEmpty()) {
            System.out.println("Нет набора суммы ");
        } else {
            System.out.println("Набор суммы: " + subset);
        }
    }
}

