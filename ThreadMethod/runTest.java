package ThreadMethod;
/*
* 这是我们观察我们的线程运送过程的代码*/
class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程"+Thread.currentThread().getName());
    }
}
public class runTest {
    public static void main(String[] args) {
        MyThread1 mt=new MyThread1();
        mt.run();//直接通过对象调用run（）方法
        new Thread(mt).start();//通过线程调用
    }
}
