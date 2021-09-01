package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String s = scanner.next();
        String[] list = words.split("\\s+");

        for(int i = 0; i< list.length;i++){
            if(list[i].equals(s)){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("Not found");
    }
}
