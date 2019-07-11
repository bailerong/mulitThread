package MyCallable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MyThread implements Callable{
    private int ticket=10;
    @Override
    public Object call() throws Exception {
        while(this.ticket>0){
            System.out.println("剩余票数"+this.ticket--);
        }
        return "票完了";
    }
}
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask<>(new MyThread());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}
//为了返回值
