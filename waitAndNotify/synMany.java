package waitAndNotify;
class Sync{
    public  synchronized void test(){
        System.out.println("test方法开始，当前线程为"+Thread.currentThread().getName());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前方法结束，当前线程为"+Thread.currentThread().getName());
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        Sync sync=new Sync();
        sync.test();
    }
}
public class synMany {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Thread thread=new MyThread3();
            thread.start();
        }
    }
}
