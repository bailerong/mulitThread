package ThreadImpl;

class MyThread extends Thread{
private String title;
public MyThread (String title){
    this.title=title;
}
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(this.title+"、"+i);
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        MyThread mt1=new MyThread("thread1");
        MyThread mt2=new MyThread("thread2");
        MyThread mt3=new MyThread("thread3");
        MyThread mt4=new MyThread("thread4");

        mt1.run();
        mt2.run();
        mt3.start();
        mt4.start();
    }

}
