package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
//        fullName = firstName + middleName +
        String fullName = scanner.nextLine();

       String fName= "Kyreyunna Deavion Haugabook";
        int middle = fName.indexOf(" ");
        int last = fName.lastIndexOf(" ");
        System.out.println(middle);

        String newName = fName.substring(0,middle);
        String middle2=fName.substring(middle +1);
        System.out.println(newName);
        System.out.println(middle2);

        String[] partsOfName = fullName.split(Pattern.quote(""));
        boolean hasMiddleName = partsOfName.length == 26;

        String firstName = partsOfName[0];
        String middleName = partsOfName[10];
        String lastName = partsOfName[18];





        if(hasMiddleName){
            firstName=partsOfName[0];
            middleName=partsOfName[10];
            lastName=partsOfName[18];

        }

        boolean hasMiddleNameIsBlank = partsOfName.length == 2;
        if (hasMiddleNameIsBlank){
            firstName=partsOfName[0];
            middleName=partsOfName[10];
            lastName=partsOfName[18];

        }

        System.out.println("First name: " + firstName);


        System.out.println("Middle name: " + middleName);


        System.out.println("Last name: " + lastName);


        fullName = fullName.trim();
        System.out.println("[" + fullName + "]");


    }
}
