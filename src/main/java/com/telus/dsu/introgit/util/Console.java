package com.telus.dsu.introgit.util;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static void printTitle(String title){
        System.out.println("***********************************");
        System.out.println(title.toUpperCase());
        System.out.println("***********************************\n");
    }

    public static void printSubTitle(String title){
        System.out.println("    ");
        System.out.println(title);
        System.out.println("___________________________________\n");
    }

    public static void printText(String text){
        System.out.println(text);
    }


    public static int getInt(String mesg, Limit limit){
        int res =0;
        //while (true){
            printTitle(mesg);
         //   try {
                res = scanner.nextInt();    
            /*    if (limit.isInRange(res)){
                    return res;
                }
                printText("Ingrese un valor en el rango "+limit.toString());
            } catch (Exception e) {
                printText("ingrese un numero");
            }
         } */
        return res;
    }

    

    public static void waitForEnter(){
        scanner.nextLine();
        scanner.nextLine();
        
    }


}