package assignmentt2;

//WAP to create one thread by extending Thread class in another Class
class First extends Thread{
	
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Extend_Thread {

public static void main(String[] args) throws InterruptedException {
	First f1=new First();
	f1.start();
	
	for (int i = 1; i <=5; i++) {
		System.out.println("This is main Thread");
		Thread.sleep(2000);
	}

}

}
