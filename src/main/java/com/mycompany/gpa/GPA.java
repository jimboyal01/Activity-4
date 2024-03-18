/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gpa;

import java.util.Scanner;
//Allanic Jimboy Ralph T.

public class GPA {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int grade;
        System.out.println("Exam Score: ");
        grade = scn.nextInt();
        
        if (grade >= 70){
            double GPA = 3.5;
            System.out.println("Your GPA is Above: " + GPA);
            System.out.println("Congratulations! Your Are eligible for Admission");
        } else if (grade <=70){
            double GPA= 3.0;
            System.out.println("Your GPA is Below: " + GPA);
            System.out.println("Sorry, you are not eligible for Admission");
                
            
        }
        
        
    }
}
