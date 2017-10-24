package HW10;

public class MyThread2 extends Thread {
    public void  run(){
        for (int i =0; i<5; i++){
            System.out.println( i+ "MyThread2");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}