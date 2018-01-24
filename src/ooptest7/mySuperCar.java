package ooptest7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        mySuperCar c2 = new mySuperCar();
        c2 = inputData(c2);
    }

    private  static  Student inputData (Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleass enter a student info: ");
        System.out.print("Student ID:");
        s.setId(scanner.nextLine());
        System.out.print("Name:");
        s.setName(scanner.nextLine());
        System.out.print("Address:");
        s.setAddress(scanner.nextLine());
        System.out.print("gender:");
        s.setGender(scanner.nextLine());
        return s;
    }//

}//class