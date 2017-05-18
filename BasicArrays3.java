/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarrays3;

import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class BasicArrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
       
        for(int i=0; i<1000; i++){
            
            int num = 10 + r.nextInt(89);
            int arr[] = new int[1000];
            arr[i] = num;
            System.out.println(arr[i]);
            
        }
    
    
    }
    
}
