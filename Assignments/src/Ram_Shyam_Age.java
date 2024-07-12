
public class Ram_Shyam_Age {
/*
 * 2.condition---If the ages of Ram, Shyam and Ajay are input through the 
keyboard, write a program to determine the youngest of the 
three. 
 */
	public static void main(String[] args) {
		
		int ram=60;
		int shyam=45;
		int Ajay=50;
		
		if (ram<shyam && ram<Ajay) {
			System.out.println("Ram is Younger");
			
		}else if (shyam<ram && shyam<Ajay) {
			System.out.println("Shyam is Younger");
			
		}else{
			System.out.println("Ajay is Younger");
		}
			
		
	}
}
