package HW9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Io {
    public static void main (String []args){
        int [] i = new int[]{5,10,15,20,25};
        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))){
            for (int element :i){
                bufferedWriter.write((String.valueOf(element)));
                bufferedWriter.write("\n");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
