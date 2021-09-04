package search;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XFile {

    public static List<String> readAll(String fileName){
        List<String> inputs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
             while (reader.ready()){
                 inputs.add(reader.readLine());
             }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return inputs;
    }
}
