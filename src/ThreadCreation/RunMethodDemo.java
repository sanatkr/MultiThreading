package ThreadCreation;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ---> "+i);
		}
	}
	
	public void run(int x)
	{
		System.out.println(Thread.currentThread().getName()+" Parameterised run method");
	}
}

public class RunMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 mt = new MyThread1();
		
		mt.start();
		//mt.join();
		mt.run(10);

	}

}
