package HW11;

import java.util.Random;

public class HW11_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[1000];
    public void bublesort() {
        bublesort( int [] list){
            for (int i = list.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (list[i] > list[j] + 1) {
                        int t = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = t;
                        System.out.println(list[i]);
                    }
                }
            }
         }

        }
    }
}

