package Thread;

class MyThread extends Thread{
    private int ticket=10;

    @Override
    public void run() {
        while(this.ticket>0){
            System.out.println("剩余票数"+this.ticket--);

        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
