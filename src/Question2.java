
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
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many heights will be entered");
        int numbPeo = input.nextInt();

        //array 
        double[] heights = new double[numbPeo];
        for (int i = 0; i < numbPeo; i++) {
            System.out.println("Enter the heights of the people in cm");
            heights[i] = input.nextDouble();
            total = total + heights[i];
        }
        //get avg
        double avg = total / numbPeo;
        //walk though array 
        for (int i = 0; i < heights.length; i++) {
           //find which are above avg
            if (avg <= heights[i]) {
                System.out.println("This height is above the avg:" + heights[i]);
            }

        }
    }
}
