import java.util.Scanner;
//Josh Eney COSC 236 object lab
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please enter 5 Students and their IDs and GPA");
    
        Student[] students = new Student[5];

        for (int x = 0; x < students.length; x++){
        Student student = new Student();
        System.out.println("Enter their first name");
        student.studentName = input.next();

        System.out.println("Enter their current GPA");
        student.GPA = input.nextDouble();
        System.out.println("Enter their ID number");
        student.studentID = input.nextInt();

        students[x] = student;


        }
//Print student info
        System.out.println(students[0].studentName + " is a student at TU " + students[0].studentID + " is his id number and his GPA is  " + students[0].GPA);
        System.out.println(students[1].studentName + " is a student at TU " + students[1].studentID + " is his id number and his GPA is  " + students[1].GPA);
        System.out.println(students[2].studentName + " is a student at TU " + students[2].studentID + " is his id number and his GPA is  " + students[2].GPA);
        System.out.println(students[3].studentName + " is a student at TU " + students[3].studentID + " is his id number and his GPA is  " + students[3].GPA);
        System.out.println(students[4].studentName + " is a student at TU " + students[4].studentID + " is his id number and his GPA is  " + students[4].GPA);
//call methods
        highestGPA(students);
        smallestGPA(students);
        avgGPA(students);
    }
//method to find highest GPA

public static void highestGPA(Student[] students){
    
    System.out.println("This is the largest GPA:");
 
double highestGPA = 0;
String studentName = "";
for (int x = 0; x < students.length; x++)
{
if (students[x].GPA > highestGPA )
 
highestGPA = students[x].GPA;
studentName = students[x].studentName;
}
System.out.println(studentName + " has the highest GPA of " + highestGPA);

    }

    //find smallest GPA 
public static void smallestGPA(Student[] students){
    System.out.println("This is the smallest GPA:");
 
    double smallestGPA = students[0].GPA;
String studentName = "";
for (int x = 0; x < students.length; x++)
{
   
if (students[x].GPA < smallestGPA )
 
smallestGPA = students[x].GPA;
studentName = students[x].studentName;
}
System.out.println(studentName + " has the lowest GPA of " + smallestGPA);


}

public static void avgGPA(Student[]students){
System.out.println("This is the average of GPAs entered:");
double avg = 0;
double sum = 0;
 
for (int x = 0; x < students.length; x++){
sum = sum + students[x].GPA;

 avg = sum/5;
}
System.out.println("The average GPA is " + avg);

 

}



}
