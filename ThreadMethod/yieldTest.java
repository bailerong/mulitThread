package ThreadMethod;
class MyThread3 implements Runnable{
    @Override
    public void run() {
for(int i=0;i<10;i++){
    Thread.yield();
    System.out.println("当前线程"+Thread.currentThread().getName()+"i="+i);
}
    }
}
public class yieldTest {
    public static void main(String[] args) {
        MyThread3 mt=new MyThread3();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
