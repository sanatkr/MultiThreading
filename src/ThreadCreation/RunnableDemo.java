package ThreadCreation;

class MyRunnable1 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ==== "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class RunnableDemo {

	public static void main(String[] args) throws Exception {
		
		MyRunnable1 r = new MyRunnable1();
		Thread t1 = new Thread(r);
		t1.start();
		t1.join();
		
//		Thread t2 = new Thread(r);
//		t2.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ==== "+i);
		}

	}

}
