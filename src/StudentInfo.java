import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        //Variable 
        Scanner scanner = new Scanner(System.in);

        //Input data from user
        System.out.print("Enter student Id:");
        int id = scanner.nextInt();

        System.out.print("Enter student name:");
        String name = scanner.next();

        System.out.print("Enter stduent gender(M/F):");
        char gender = scanner.next().charAt(0);
        
        System.out.print("Enter scote Math:");
        double math = scanner.nextDouble();

        System.out.print("Enter Physics score:");
        double phy = scanner.nextDouble();

        System.out.print("Enter Biology score:");
        double bio = scanner.nextDouble();

        System.out.print("Enter Java score:");
        double java = scanner.nextDouble();

        double totalScore = math + phy + bio + java;
        double averageScore = totalScore/4;

        //Diplay the results
        System.out.println("\nStudent Information");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Math score:"+math);
        System.out.println("Physics score:"+phy);
        System.out.println("Biology score:"+math);
        System.out.println("Java score:"+math);
        System.out.println("The Total score :"+totalScore);
        System.out.println("The Average score:"+averageScore);


    }
    
}
