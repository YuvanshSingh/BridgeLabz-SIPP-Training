public class Pen_distribution {
	public static void main(String[] args) {
		int total_pens = 14;
		int students = 3;
		int pen_quantity = total_pens/students;
		int remaning = total_pens%students;
		
		System.out.println("The Pen Per Student is " +  pen_quantity + " and the remaining pen not distributed is "+ remaning);
	}
}


