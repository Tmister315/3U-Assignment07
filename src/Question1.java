
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are there?");
        int numbStud = input.nextInt();
        int total = 0;
        int[] marks = new int[numbStud];
        for (int i = 0; i < numbStud; i++) {
            System.out.println("Enter the marks for the students");
            marks [i] = input.nextInt();
            
            
           total = total + marks[i] ;
           
        }
           double avg = total /numbStud;
           System.out.println("The average is " + avg);
    }
}
