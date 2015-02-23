
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
public class ForAndOperation {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n =  scanner.nextInt();
        System.out.println("Number 1 -"+ n);
        for(int i=1; i<= n; i++){
        if(i % 2 ==0){
            System.out.println("EvenNumber = "+ i);
        }
        }
        System.out.println("DivisibleOFThree = "+ n/3);
    }
}

