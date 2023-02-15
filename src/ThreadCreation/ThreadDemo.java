package ThreadCreation;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ==== "+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		
		MyThread mt = new MyThread();
		mt.start();
		
		// main thread will wait until the completion of child thread
		mt.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ===== "+i);
		}
		

	}

}
