package Keep;
class A implements Runnable{
    private int i;
    @Override
    public void run() {
        while(true){
            i++;
            System.out.println("线程名称"+Thread.currentThread().getName()
            +",i="+i+"，是否为守护线程："+Thread.currentThread().isDaemon());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("线程名称"+Thread.currentThread().getName()+"中断线程了");
            }
        }
    }
}
public class keepThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new A(),"子线程A");
        //设置线程A为守护线程，此语句必须在start方法之前执行
        thread1.setDaemon(true);
        thread1.start();
        Thread thread2=new Thread(new A(),"子线程B");
        thread2.start();
        Thread.sleep(3000);
        //中断非守护线程
        thread2.interrupt();
        Thread.sleep(10000);
        System.out.println("代码结束");
    }
}
//我们的线程池
//我们的很多东西
//我们需要掌握
