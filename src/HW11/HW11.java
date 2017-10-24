package HW11;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[1000];
        for (int i = 0; i < 1000; i++) {
            list[i] = random.nextInt(1000);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numbers.txt"))) {
                    for (i=0; i<1000; i++) {
                        list[i]= random.nextInt(1000);
                        bufferedWriter.write((String.valueOf(list[i])));
                        bufferedWriter.write("\n");
                    }
                } catch (IOException ex)

                {
                    ex.printStackTrace();
                }
            }
        }
    }