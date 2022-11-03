import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

class Worker implements Runnable
{
	public void run() {
		
	}
	 (new Thread(new ImplementRunnableThread())).start();
	 //latch = # of workers, and set at the beginning a set # of workers
}

public class Bank {
	public Bank ()
	{
		
	}
	static CountDownLatch latch;
	public static void main (String[] args)
	{
		latch = new CountDownLatch(numThreads);
		try {
			latch.await();
		} catch (InterruptedException Exception e) {}

		ArrayBlockingQueue queue = new ArrayBlockingQueue<Transaction>(queueSize)

		Object thisTransaction;
		queue.put(thisTransaction);
		queue.take();

	}
}

