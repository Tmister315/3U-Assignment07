
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
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //input
        System.out.println("How many marks will be entered?");
        int numb = input.nextInt();
        //array
        int[] markSorter = new int[numb];
        for (int i = 0; i < numb; i++) {
            System.out.println("Enter mark number " + (i + 1));
            markSorter[i] = input.nextInt();
        }
        
        int counter2 = numb -1;
        int counter1 = counter2 - 1;
        int tempMarkSorter = 0;
        int tempMarkSorter2 = 0;
        int median1 = 0;
        int median2 = median1 + 1;
//Sorting    
        for (int i = 0; i < numb - 1; i++) {

            while (markSorter[counter1] >= markSorter[counter2] && counter1 >= 1) {
//switch
                tempMarkSorter = markSorter[counter1];
                tempMarkSorter2 = markSorter[counter2];
                markSorter[counter1] = tempMarkSorter2;
                markSorter[counter2] = tempMarkSorter;
                tempMarkSorter = 0;
                tempMarkSorter2 = 0;

            }
        //decrease counters
            counter2--;
            counter1--;
        }
//Median 
        if (numb % 2 == 0) {
           double  median = markSorter[numb/2 -1] + markSorter[numb/2] /2 ;
            System.out.println("The median is " + median);
        }
        if (numb % 2 == 1) {
            double median = numb/2;
            System.out.println("The median is " + median);
        }
        //output
        System.out.println("The marks are sorted from largest to smallest: ");

        for (int i = 0; i < numb; i++) {
            System.out.println("");
            System.out.println(markSorter[i]);
        }
    }

}
