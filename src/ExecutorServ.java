import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServ {

	public ExecutorServ() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		ScheduledExecutorService es2 = Executors.newScheduledThreadPool(2);
		
		Runnable runn2 = () -> {
			try {
				System.out.println("Scheduled Thread "+ Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e)
			{
				throw new IllegalStateException(e);
			}
		};
		
		/*Runnable runn = () -> {
			try {
				
				System.out.println("Hello M1"+Thread.currentThread().getName());
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println("Hello M2"+Thread.currentThread().getName());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
			
		};
		
		Callable<String> c1 = () -> {
			try {
				System.out.println("Scheduled Thread "+ Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e)
			{
				throw new IllegalStateException(e);
			}
			return "ab";
		};
		
		
		
		/*for(int x =0; x<=100;x++)
			es.execute(runn);*/
		//	es.execute(runn);
		
		/*Future<String> f1 = es.submit(c1);
		
		try {
			System.out.println(f1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
			//es2.schedule(runn2, 3, TimeUnit.SECONDS);
			//es2.schedule(runn2, 500, TimeUnit.MILLISECONDS);
			
			// Runnable task , Fixed initial delay, time after which next thread needs to scheduled, time unit. 
			es2.scheduleAtFixedRate(runn2,0,2,TimeUnit.MILLISECONDS);
			//es2.scheduleWithFixedDelay(runn2, 0, 300, TimeUnit.MILLISECONDS);
		
		//es.shutdown();
		//es2.shutdown();
		
	}

}
