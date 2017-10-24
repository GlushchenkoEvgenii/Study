package HW10;

public class MyThread1 extends Thread {
    public void  run(){
        for (int i =0; i<5; i++){
            System.out.println( i+ "MyThread1");
            try {
                sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}