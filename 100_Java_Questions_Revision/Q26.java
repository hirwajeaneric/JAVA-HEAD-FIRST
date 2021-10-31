import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        //This program will take a series of numbers and count the number of positive and negative numbers.@interface
        
        //Entering Data
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Please enter 6 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        System.out.println("\nYou have entered: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        } 

        //Positives & Negatives
        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        //Counting
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                numberOfPositives++;
            } else if(arr[i]<0){
                numberOfNegatives++;
            }
        } 

        //Results
        System.out.printf("\n\nThe number of positive numbers is: %d",numberOfPositives);
        System.out.printf("\nThe number of negative numbers is: %d\n\n",numberOfNegatives);
        reader.close();
    }
}