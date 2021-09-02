package search;

import java.util.Scanner;

public class MyInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String nextLine(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int nextInt(String message){
        return Integer.parseInt(nextLine(message));
    }
}
