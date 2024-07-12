
public class Insurance {

/*
 * 2.condition---An Insurance company follows following rules to calculate 
premium. 
(1) If a person’s health is excellent and the person is between 
25 and 35 years of age and lives in a city and is a male 
then the premium is Rs. 4 per thousand and his policy 
amount cannot exceed Rs. 2 lakhs. 
(2) If a person satisfies all the above conditions except that 
the sex is female then the premium is Rs. 3 per thousand 
and her policy amount cannot exceed Rs. 1 lakh. 
(3) If a person’s health is poor and the person is between 25 
and 35 years of age and lives in a village and is a male
then the premium is Rs. 6 per thousand and his policy 
cannot exceed Rs. 10,000. 
(4) In all other cases the person is not insured. 
Write a program to output whether the person should be 
insured or not, his/her premium rate and maximum amount 
for which he/she can be insured. 	
 */
	
	public static void main(String[] args) {
		
		String health = "Good";
		int age= 28;
		String residence = "City";
		String Gender =  "Male";
		
		int premium;
		int amount;
		
		if (health.equals("Excellent") && age>=25 && age<=35 && residence.equals("City") && Gender.equals("Male")) {
			premium=3;
			amount=200000;
			System.out.println("Person is Insured");
			System.out.println("Premium rate: Rs. " + premium + " per thousand");
            System.out.println("Maximum policy amount: Rs. " + amount);
		}else if (health.equals("excellent") && age >= 25 && age <= 35 && residence.equals("city") && Gender.equals("female")) {
            premium = 3;
            amount = 100000;
            System.out.println("The person is insured.");
            System.out.println("Premium rate: Rs. " + premium + " per thousand");
            System.out.println("Maximum policy amount: Rs. " + amount);
		}else if (health.equals("Poor") && age >= 25 && age <= 35 && residence.equals("Village") && Gender.equals("Male")) {
            premium= 6;
            amount = 10000;
            System.out.println("The person is insured.");
            System.out.println("Premium rate: Rs. " + premium + " per thousand");
            System.out.println("Maximum policy amount: Rs. " + amount);
        } else {
            System.out.println("The person is not insured.");
        }

	}

}
