
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
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        int temp1 = 0;
        Scanner input = new Scanner(System.in);
// array 
        int[] array = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the  integer");
            array[i] = input.nextInt();
        }

        if (array[0] > array[1]) {
            //switch the values
            temp1 = array[0];
            array[1] = array[0];
            array[1] = temp1;
        }
        System.out.println("The numbers in ascending order are");
        for (int i = 0; i < 2; i++) {
            System.out.println(array[i]);
        }

    }
}
