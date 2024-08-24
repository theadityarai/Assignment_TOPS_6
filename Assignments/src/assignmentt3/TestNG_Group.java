package assignmentt3;
//W.a. TestNG program to create group with testing.xml file
import org.testng.annotations.Test;

public class TestNG_Group {
	 @Test(groups = {"red"})
	  public void red1() {
		  System.out.println("this is red group");
	  }
	  
	  @Test(groups = {"red"})
	  public void red2() {
		  System.out.println("this is red group");
	  }
	  
	  @Test(groups = {"red"})
	  public void red3() {
		  System.out.println("this is red group");
	  }
	  
	  @Test(groups = {"green"})
	  public void green1() {
		  System.out.println("this is green group");
	  }
	  
	  @Test(groups = {"green"})
	  public void green2() {
		  System.out.println("this is green group");
	  }
	  
	  @Test(groups = {"green"})
	  public void green3() {
		  System.out.println("this is green group");
	  }
	  
	  @Test(groups = {"green", "red"})
	  public void green_red() {
		  System.out.println("this is green and red group");
	  }
	}
