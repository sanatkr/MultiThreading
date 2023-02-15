package ThreadCreation;
/**
 * @author SANAT
 *
 */
class Display
{
	int n = 10;
	static int i=1;
	void printEven() throws Exception
	{
		//System.out.println("even");
		synchronized(this)
		{
			while(i<n)
			{
				while(i%2!=0)
				{
					
					this.wait();
					
				}
				System.out.println(Thread.currentThread().getName()+" ==== "+i);
				i++;
				this.notify();
				
			}
		}
		
	}
	
	void printOdd() throws Exception
	{
		synchronized(this)
		{
			while(i<n)
			{
				while(i%2==0)
				{
					
					this.wait();
					
				}
				System.out.println(Thread.currentThread().getName()+" ==== "+i);
				i++;
				this.notify();
				
			}
		}
		
	}
}

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Display d = new Display();
		
		
		Thread evenThread = new Thread(new Runnable()
				{
					
					public void run() 
					{
						
						try {
							d.printEven();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				},"evenThread");
		
		
		Thread oddThread = new Thread(new Runnable()
				{
					public void run()
					{
						try {
							d.printOdd();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				},"oddThread");
		
		evenThread.start();
		oddThread.start();

	}

}
