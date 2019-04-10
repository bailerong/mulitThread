package ThreadMethod;
/*
* 这是我们观察给线程起名字的程序
* */
class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("当前线程"+Thread.currentThread().getName()+",i="+i);

        }
    }
}
public class NameTest {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        new Thread(mt).start();//没有设置名字
        new Thread(mt).start();//没有设置名字
        new Thread(mt,"lele").start();
    }
}
