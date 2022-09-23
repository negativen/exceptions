package com.csc205.activity.exception;

import java.util.Scanner;

public class ExceptionActivity {
    public static void main(String[] args) {
    //try-catch
        try {
            // happy path - all this executes if no exception thrown
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // sad path - exception thrown
            System.out.println("Exception thrown : " + e);
            System.out.println("Out of the block");
            e.printStackTrace();
        }
        //next section

        // try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // Do something here
        } catch (NullPointerException e) {
            // we'll catch the NullPointerException here and handle it differently than other exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }
        //next section

        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // always do something
        }
        //next section

        try {
            // do something we don't expect to throw exceptions
        }
        finally {
            // but if we do, always execute code here
        }
        //next section

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            // do something with scanner1
        }
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
        }
        finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }
        try (Scanner scanner3 = new Scanner(System.in)) {
            // do something with scanner3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
