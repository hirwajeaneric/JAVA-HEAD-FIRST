import java.util.Scanner;

class StudentArrayTestDrive2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);    
        int i = 0;
        int size = 0;

        try {
            System.out.println("\nHow many students are you going to enter?");
            size = reader.nextInt();
            Students [] studentArr = new Students[size];

            System.out.println("\nEnter their Details:");
 
            while (i < size) {
                studentArr[i] = new Students();
                System.out.println("\nEnter student "+i+"'s registration number: ");
                studentArr[i].registrationNumber = reader.nextInt();
                System.out.println("Enter student "+i+"'s name: ");
                studentArr[i].name = reader.next();
                i++;
            }

            System.out.println("\nDETAILS OF REGISTERED STUDENTS: \n");

            for (i = 0; i < size; i++) {
                System.out.println(studentArr[i].registrationNumber+ " , " +studentArr[i].name);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }
}