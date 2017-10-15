/**
 * Created by student on 04.10.2017.
 */
public class Demo {
    public static void main (String[] args){
        TestMyExeption testMyExeption = new TestMyExeption();
        try {
            testMyExeption.Eugen();
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
            System.err.println("Fin");
        }
    }
}
