package p1;

public class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani from RoadSideHotel");		
	}

	@Override
	public void masalaDosa() {
		System.out.println("masalaDosa from RoadSideHotel");		
	}

	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}

	
}
