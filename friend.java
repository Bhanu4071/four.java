
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Bag implements Runnable {
    public void run() {

        System.out.println("main thread:" + Thread.currentThread().getName() + "" + System.currentTimeMillis());
        int i;
        {
            for(i=0;i<=10;i++)
           {    System.out.println(i);
           }
        }
    }
}

public class friend
{
       public static void main(String[] args)
       {
           System.out.println("main thread:"+Thread.currentThread().getName()+""+System.currentTimeMillis());
           Runnable t1 = new Bag();
           ExecutorService executor = Executors.newFixedThreadPool(5);
           executor.submit(t1);





       }

}


