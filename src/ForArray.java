
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Pacharawat
 */
public class ForArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of Array");
        int size = scanner.nextInt();
        int value[] =  new int[size]; 
        for(int i=0;i<value.length;i++){
            value[i] = (int)(Math.random()*50+1);
        } 
        System.out.println("Values of Array");
        for(int i=0;i<value.length;i++){
            System.out.println("Array["+i+"] : "+value[i]);
        } 
        int temp = 0;
        for(int i=0;i<value.length-1;i++){
            for(int j=0;j<value.length-1;j++){
                if(value[j]>value[j+1]){
                    temp = value[j];
                    value[j] = value [j+1];
                    value[j+1] = temp;
                }
            }
        }
        System.out.println("MaxValue"+value[value.length-1]);
    }
}
