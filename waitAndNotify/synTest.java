package waitAndNotify;
class MyThread1 implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            synchronized (this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +
                            ",还有" + this.ticket-- + "张票");
                }
            }
        }
    }
}
public class synTest {
    public static void main(String[] args) {
        MyThread1 mt=new MyThread1();
        Thread t1=new Thread(mt,"黄牛A");
        Thread t2=new Thread(mt,"黄牛B");
        Thread t3=new Thread(mt,"黄牛C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
