package OutThread;

class MyThread2 implements Runnable{
    private boolean flag=true;
    @Override
    public void run() {
        int i=1;
        while(flag){
            try {
                Thread.sleep(1000);
                boolean bool=Thread.currentThread().isInterrupted();
                if(bool){
                    System.out.println("非阻塞情况下执行该操作。。。线程状态"+bool);
                    break;
                }
                System.out.println("第"+i+"次执行，线程名称为："+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                System.out.println("退出了");
                /*
                * 这里退出阻塞状态，且中断标志会被系统自动清除
                * 并且重新设置为false，所以此处boolean为false
                * */
                boolean bool=Thread.currentThread().isInterrupted();
                System.out.println(bool);
                //退出run方法，中断进程
                return;
            }
        }
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
}
public class interruptTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2=new MyThread2();
        Thread thread=new Thread(myThread2,"子线程");
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        System.out.println("代码结束");
    }
}
