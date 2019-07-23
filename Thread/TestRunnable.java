package Thread;
class MyThread1 implements  Runnable{
    private  int ticket=10;
    @Override
    public void run() {
    while(this.ticket>0){
        System.out.println("剩余票数"+this.ticket--);
    }
    }
}
public class TestRunnable {
    public static void main(String[] args) {
     MyThread1 mt=new MyThread1();
     new Thread(mt).start();
     new Thread(mt).start();
    }
}
//卖票是我们的非常经典的一个例子
