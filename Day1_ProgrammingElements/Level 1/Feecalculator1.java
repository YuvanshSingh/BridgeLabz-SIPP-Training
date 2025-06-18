public class Feecalculator1 {

	public static void main(String[] args) {
		int fees = 125000;
		int discount_percentage = 10;
		int discount_amount = (125000*10)/100;
		int fee_submit = fees - discount_amount;
		System.out.println(fee_submit);
	}

}
