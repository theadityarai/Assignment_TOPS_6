//W.A.J.P to check given number is Armstrong or not?

package assignmentt2;

public class Armstrong_Number_D {
public static void main(String[] args) {

	int no1=372, num=no1,rem123,cube,sum=0;
	while (no1 != 0) {

	rem123=no1%10; //3

	cube=(int) Math.pow(rem123, 3);//27
	no1=no1/10; //15
	sum=sum+cube;
	}

	if(num == sum) {
	System.out.println("armstrong no");
	}else {
	System.out.println("not an armstrong no");
	

	
}

}
}
