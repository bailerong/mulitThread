package OutThread;

/*
*
* 这是我们的代码里面设置标记位是我们的程序退出的方法
* */
class MyThread implements Runnable{
    private boolean flag=true;
    @Override
    public void run() {
        int i=1;
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println("第"+i+"次执行，线程名称为"+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
}
public class flageTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        Thread thread1=new Thread(myThread,"子线程");
        thread1.start();
        Thread.sleep(2000);
        myThread.setFlag(false);
        System.out.println("代码结束");
    }
}
