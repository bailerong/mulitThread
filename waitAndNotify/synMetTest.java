package waitAndNotify;
class MyThread2 implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        for(int i=0;i<100;i++)
this.sale();
    }
    public synchronized  void sale(){
        if(this.ticket>0){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",还有"+this.ticket--+"张票");
        }
    }
}
public class synMetTest {
    public static void main(String[] args) {
        MyThread2 mt=new MyThread2();
        Thread t1=new Thread(mt,"黄牛A");
        Thread t2=new Thread(mt,"黄牛B");
        Thread t3=new Thread(mt,"黄牛C");
        t1.start();
        t2.start();
        t3.start();

    }
}
