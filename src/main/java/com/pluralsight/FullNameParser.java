package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();



        String[] partsOfName = fullName.split(Pattern.quote(""));
        boolean hasMiddleName = partsOfName.length == 3;

        String firstName = partsOfName[0];
        String middleName = "";
        String lastName = "";





        if(hasMiddleName){
            middleName=partsOfName[1];
            lastName=partsOfName[2];

        }

        boolean hasMiddleNameIsBlank = partsOfName.length == 2;
        if (hasMiddleNameIsBlank){
            firstName=partsOfName[0];
            lastName=partsOfName[1];

        }

        System.out.println("First name: " + firstName + "Middle name: " + middleName + "Last name: " + lastName);

        String output = "";
        System.out.println("[" + output + "]");


    }
}
