package waitAndNotify;
class MyThread implements Runnable{
    private int ticket=10;//一共有10张票
    @Override
    public void run() {
        while(this.ticket>0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"还有"+this.ticket--+"张票");
        }
    }
}
public class matterTest {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        new Thread(mt,"A").start();
        new Thread(mt,"B").start();
        new Thread(mt,"C").start();

    }
}
