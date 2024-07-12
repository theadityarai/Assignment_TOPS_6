
public class Cost_Price {

//If the total selling price of 15 items and the total profit earned on them is input through the keyboard, write a program to find the cost price of one item.
	
	public static void main(String[] args) {
		int totalSellingPrice = 1200; 
        int totalProfit = 200; 

        int totalCostPrice = totalSellingPrice - totalProfit;
        int costPricePerItem = totalCostPrice / 15;

        System.out.println("The cost price of one item is: " + costPricePerItem);

	}

}
