package HW9;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Point1 {
    public static void main (String[] args){
        String[] i = new String[]{"Mama clean window"};
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mama.txt"))){
            for (String element:i){
                bufferedWriter.write(String.valueOf(element));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
