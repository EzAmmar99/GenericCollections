/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Ez Ammar
 */
public class randomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 25; i++) {
            int n = random.nextInt(100);
            n += 1;
            linkedList.add(n);
        }
        
        LinkedList<Integer> ranNum = linkedList;
        Collections.sort(linkedList);
        
        int sum = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            sum += linkedList.get(i);
        }
        
        System.out.println("The random number : " + ranNum);
        System.out.println("The random number after sorting : " + linkedList);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / 25);
    }

}
