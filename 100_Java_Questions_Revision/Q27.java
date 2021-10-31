import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of resistances: ");
        int numbers = reader.nextInt();
        
        float resistors[] = new float[numbers];
        System.out.println("\nPlease enter resistors: ");
        for (int i = 0; i < resistors.length; i++) {
            resistors[i] = reader.nextFloat();
        }

        float inverseResistor = 0;
        for (int i = 0; i < resistors.length; i++) {
            inverseResistor = inverseResistor + (1/resistors[i]);
        }

        //Total resistance
        float TotalResistance = 1/inverseResistor; 
        System.out.printf("The total resistance is: %f \n\n",TotalResistance);
        reader.close();
    }
}