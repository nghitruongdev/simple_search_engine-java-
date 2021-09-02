package search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //read inputs
        int n = MyInput.nextInt("Enter the number of people:");
        String[] array = new String[n];
        System.out.println("Enter all people:");
        for (int i = 0; i < n; i++) {
            array[i] = MyInput.nextLine("").trim();
        }

        int numberQuery = MyInput.nextInt("Enter the number of search queries:");
        for (int i = 0; i < numberQuery; i++) {
            String query = MyInput.nextLine("Enter data to search for people:");
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


    }

    public static ArrayList<String> find(String[] array, String word) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            if (find(string, word)) {
                list.add(string);
            }
        }
        return list;
    }

    public static boolean find(String string, String word) {
        return string.toLowerCase().contains(word.toLowerCase());
    }
}
