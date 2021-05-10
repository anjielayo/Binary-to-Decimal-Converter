/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintodec;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class BintoDec {
public static void bindec(){
    Scanner choice=new Scanner(System.in);
    String ch;
    do{
    System.out.println("Enter your option, 1 for binary to decimal conversion, 2 for decimal to binary conversion: ");
    Scanner input=new Scanner(System.in);
    int op=input.nextInt();
    
    if (op==1){
        System.out.println("Enter your binary number: ");
        Scanner i=new Scanner(System.in);
        String bin=i.nextLine();
        int dec=Integer.parseInt(bin,2); 
        System.out.println("Your decimal digit is "+dec+".");
    }
    else if(op==2){
        System.out.println("Enter your decimal number: ");
        Scanner n=new Scanner(System.in);
        int dec=n.nextInt();
        String bin=Integer.toBinaryString(dec);
        System.out.println("Your binary digit is "+bin+".");
    }
    else{
        System.out.println("You entered the wrong option.");
        
    }
    
    System.out.println("Want to try again? Enter Y to continue, Press any other key to exit.");
    ch=choice.next();}
    while(ch.equalsIgnoreCase("Y"));
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BintoDec.bindec();
    }
    
}
