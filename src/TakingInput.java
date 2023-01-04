import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1. Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz.

        String firstName = sc.next();
        String lastName = sc.next();
        int rollNo = sc.nextInt();
        String fieldOfInterest = sc.next();
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Roll number: "+rollNo);
        System.out.println("Field of interest: "+fieldOfInterest);

//        Q2. Input two different string and print them in same line.

        String a = sc.next();
        String b = sc.next();
        System.out.print(a);
        System.out.print(b);

//        Q3. If the marks of Robert in three subjects are entered through keyboard (each out of
//        100), write a program to calculate his total marks and percentage marks.

        int firstSubject = sc.nextInt();
        int secondSubject = sc.nextInt();
        int thirdSubject = sc.nextInt();
        int total = firstSubject + secondSubject + thirdSubject;
        int percentage = total/3;
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage Marks : "+percentage+"%");

//        Q4. Given two numbers, return their sum in the following format:
//        Int t representing number of test cases
//        T lines of Two integers representing the numbers to be added

        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(first+second);
        }

//        Q5. Given few lines of input(number of lines unknown) where each line has two
//        strings, concatenate the strings.

        while(sc.hasNextLine()){
            String firstWord = sc.next();
            String secondWord = sc.next();
            System.out.println(firstWord+secondWord);
        }
    }
}
