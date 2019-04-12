package OutThread;

class MyThread1 implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println("第"+i+"次执行，线程名称为："+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class stopTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1=new MyThread1();
        Thread thread1=new Thread(myThread1,"子线程");
        thread1.start();
        Thread.sleep(2000);
        thread1.stop();
        System.out.println("代码结束");
    }
}
