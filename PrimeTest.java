/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primetest;

import java.util.Scanner;

/**
 *
 * @author Kiptoo David
 */
public class PrimeTest {

    public static void main(String[] args) {
        int num;
        int test = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number; ");
        num = scan.nextInt();
        
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                test = 1;
                break;
            }
        }
        if(test == 1){
            System.out.println("Not Prime");
        }
        if(test == 0){
            System.out.println("Prime");
        }
    }
    
}
