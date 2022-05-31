package p2;

public class AllStudents {

	public static void main(String[] args) {
		
		ScienceStudent s1 = new ScienceStudent();
		double x = s1.getPercentage();
		System.out.println("Percentage = "+x);
		HistoryStudent s2 = new HistoryStudent();
		double y = s2.getPercentage();
		System.out.println("Percentage = "+y);

	}

}
