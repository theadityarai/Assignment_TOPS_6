
public class Profit_Loss {

// Condition- If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred. 	
	
	public static void main(String[] args) {
	
		int costPrice = 100;
        int sellingPrice = 150; 

        
        if (sellingPrice > costPrice) {
            
            int profit = sellingPrice - costPrice;
            System.out.println("The seller made a profit of: " + profit);
        } else if (sellingPrice < costPrice) {
          
            int loss = costPrice - sellingPrice;
            System.out.println("The seller made a loss of: " + loss);
        } else {
            System.out.println("There is no profit or loss.");
	}
	}
}
