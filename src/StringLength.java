
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
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input of String : ");
        java.lang.String topic = scanner.nextLine();
        System.out.println("Length of String : "+topic.length());
        System.out.println();
        java.lang.String[] str = topic.split("-", 3);
        for(String i : str ){
            System.out.println("Name of String  : "+i);
        } 
        System.out.println();
        System.out.println("Number of Character : "+topic.replaceAll("[^a-zA-Z]",""));
        System.out.println("Number of Integer : "+topic.replaceAll("[^0-9]",""));           
    }
}
