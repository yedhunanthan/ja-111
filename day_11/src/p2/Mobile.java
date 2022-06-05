package p2;

import java.util.Scanner;

public class Mobile {

	public void searchOutdatedModel() {
		
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		for(Outdated mob : Outdated.values()) {
			if(mob.equals(x)) {
				System.out.println(mob+"_OUTDATED");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.searchOutdatedModel();
	}
}
