package search;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        read inputs
        String fileName = readArg(args, "--data");
        List<String> inputs = XFile.readAll(fileName);

        while (true) {
            int select = MyInput.nextInt(createMenu());
            switch (select) {
                case 1:
                    findInfo(inputs);
                    break;
                case 2:
                    printAll(inputs);
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Incorrect Option! Try again.");
            }
        }
    }

    private static String readArg(String[] args, String arg){
        for (int i = 0; i < args.length; i+=2) {
            if(args[i].equals(arg)){
                return args[i+1];
            }
        }
        return "";
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
    private static void printAll(List<String> list) {
        System.out.println("==== List Of People ====");
        for (String info : list) {
            System.out.println(info);
        }
    }

    //read user query and find info
    public static void findInfo(List<String> list) {
        String query = MyInput.nextLine("Enter a name or email to search all suitable people:");
        ArrayList<String> newList = find(list, query);
        //output results
        if (newList.isEmpty()) {
            System.out.println("No matching people found.");
        } else {
            System.out.println("Found people:");
            for (String s : newList) {
                System.out.println(s);
            }
        }
    }

    //search info in the array and return a list
    public static ArrayList<String> find(List<String> list, String info) {
        ArrayList<String> newList = new ArrayList<>();
        for (String string : list) {
            if (string.toLowerCase().contains(info.toLowerCase())) {
                newList.add(string);
            }
        }
        return newList;
    }
}
