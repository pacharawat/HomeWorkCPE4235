
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
public class IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        number2 = input.nextInt(); 
        System.out.println("Enter Third integer: ");
        number3 = input.nextInt(); 
        int max = number1; 
		if (number2 > max) 
                { max = number2; }
		if (number3 > max) 
                { max = number3; }
	System.out.println("Max : " + max);      
    }
}

