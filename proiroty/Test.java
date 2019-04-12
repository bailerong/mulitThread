package proiroty;

class MyThread implements  Runnable{
    @Override
    public void run() {
for(int i=0;i<5;i++){
    System.out.println("当前线程"+Thread.currentThread().getName()+",i="+i);
}
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t1=new Thread(mt,"1");
        Thread t2=new Thread(mt,"2");
        Thread t3=new Thread(mt,"3");
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
