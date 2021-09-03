package search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        read inputs
        String[] array = readInput();
        while (true) {
            int select = MyInput.nextInt(createMenu());
            switch (select) {
                case 1:
                    findInfo(array);
                    break;
                case 2:
                    printAll(array);
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Incorrect Option! Try again.");
            }
        }
    }

    //read input from user
    public static String[] readInput() {
        int n = MyInput.nextInt("Enter the number of people:");
        String[] array = new String[n];
        System.out.println("Enter all people:");
        for (int i = 0; i < n; i++) {
            array[i] = MyInput.nextLine("").trim();
        }
        return array;
    }

    //create simple program menu
    public static String createMenu() {
        return "=".repeat(5) + " Menu " + "=".repeat(5) +
                "\n1. Find a person" +
                "\n2. Print all people" +
                "\n0. Exit\n" +
                "=".repeat(16);
    }



    //output all infos to the screen
    private static void printAll(String[] array) {
        System.out.println("==== List Of People ====");
        for (String info : array) {
            System.out.println(info);
        }
    }

    //read user query and find info
    public static void findInfo(String[] array) {
        String query = MyInput.nextLine("Enter a name or email to search all suitable people:");
        ArrayList<String> list = find(array, query);
        //output results
        if (list.isEmpty()) {
            System.out.println("No matching people found.");
        } else {
            System.out.println("Found people:");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    //search info in the array and return a list
    public static ArrayList<String> find(String[] array, String info) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            if (string.toLowerCase().contains(info.toLowerCase())) {
                list.add(string);
            }
        }
        return list;
    }







}
