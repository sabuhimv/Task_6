/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_6;

/**
 *
 * @author SebuhiMv
 */
public class Task_6 {

    public static void main(String[] args) {
        //TASK 6
        int[] arr = {1,2,3,4};
        int uzunluq = arr.length;
        double cem = 0;
        
        for (int i = 0; i < arr.length; i++) {
            cem+=arr[i];
        }
        double netice = cem/uzunluq;
        System.out.println(netice);
    }
}
