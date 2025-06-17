public class Profit_Loss {

	public static void main(String[] args) {
		double cost_price = 129;
		double selling_price = 191;
		double profit = selling_price - cost_price;
		double profit_percentage = (profit/cost_price)*100;
		
		System.out.println("The cost price is INR " + cost_price + " and selling price INR is "+ selling_price );
		System.out.println("The profit is INR "+ profit + " and the profit percentage is " + profit_percentage);
	}

}
