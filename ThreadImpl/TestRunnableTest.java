package ThreadImpl;

class MyThread1 implements Runnable{
    private String title;
    public MyThread1(String title) {
        this.title = title;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(this.title+"、");
        }
    }
}
public class TestRunnableTest {
    public static void main(String[] args) {

       /* MyThread1 mt1=new MyThread1("Thread1");
        MyThread1 mt2=new MyThread1("Thread2");
        MyThread1 mt3=new MyThread1("Thread3");
        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();*/
     Runnable runnable=()-> System.out.println("hello world");
     new Thread(runnable).start();

    }
}
