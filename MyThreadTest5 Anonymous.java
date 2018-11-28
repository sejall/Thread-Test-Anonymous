class MyThreadTest
{
	public static void main(String args[]) throws InterruptedException
	{
		new Thread()
		{
			public void run()
			{
				while(true)
				{
					System.out.println("Hello");
					try
					{
						Thread.sleep(1000);
						
					}
					catch( InterruptedException e)
					{
						
					}
				}
			}
		};
	}.start();
	while(true)
	{
		System.out.println("bye");
		Thread.sleep(2000);
	}
}
