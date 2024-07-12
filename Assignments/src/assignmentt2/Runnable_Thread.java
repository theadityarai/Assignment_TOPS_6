package assignmentt2;
//WAP to create one thread by implementing Runnable interface in Class.


class second implements Runnable{
	
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Second Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Runnable_Thread {

	public static void main(String[] args) throws InterruptedException {
		second s1= new second();
		
		Thread t1=new Thread(s1);
		t1.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Main Thread");
			Thread.sleep(2000);
			
		}
	}

}
