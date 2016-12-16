
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
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Variables
        int counter1 = 8;
        int counter2 = 9;
        int tempMarkSorter = 0;
        int tempMarkSorter2 = 0;
       
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 marks");
        //array
        int[] markSorter = new int[10];
        //input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter mark number " + (i + 1));
            markSorter[i] = input.nextInt();
        }

//Sorting    
        for (int i = 0; i < 9; i++) {

            while (markSorter[counter1] >= markSorter[counter2]) {

                tempMarkSorter = markSorter[counter1];
                tempMarkSorter2 = markSorter[counter2];
                markSorter[counter1] = tempMarkSorter2;
                markSorter[counter2] = tempMarkSorter;
                tempMarkSorter = 0;
                tempMarkSorter2 = 0;
                counter2--;
                counter1--;
            }
        }
        //output
        System.out.println("The marks are sorted from largest to smallest: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println(markSorter[i]);
        }

    }
}
