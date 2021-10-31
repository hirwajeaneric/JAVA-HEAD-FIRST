public class StudentArrayTestDrive {
    public static void main(String[] args) {

        Students [] studentArray = new Students[3];
        int i = 0;
        studentArray[0] = new Students();
        studentArray[0].registrationNumber = 22026;
        studentArray[0].name = "Hirwa Jean Eric";
        studentArray[1] = new Students();
        studentArray[1].registrationNumber = 21202;
        studentArray[1].name = "Karangwa Davis";
        studentArray[2] = new Students();
        studentArray[2].registrationNumber = 22122;
        studentArray[2].name = "Umubyeyi Anne Marie";

        System.out.println("\nBellow is a list of registered students: \n");
        for (i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i].registrationNumber+ " , " +studentArray[i].name);
        }
    }
}
