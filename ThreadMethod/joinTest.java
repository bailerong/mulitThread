package ThreadMethod;

import MyCallable.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyThread4 implements Runnable{
    @Override
    public void run() {
        System.out.println("主线程睡眠前的时间");
        joinTest.printTime();
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("睡眠时间结束");
            joinTest.printTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class joinTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 mt=new MyThread4();
        Thread thread=new Thread(mt,"子线程A");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        thread.join();
        System.out.println("代码结束");
    }
    public static void printTime(){
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        System.out.println(time);

    }}
