package p3;

public class Car {
	
	 private int numberOfPassenger;
	 private int numberOfKms;
	 
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}
	 
	 class Sedan extends Car{
		 int farePerKm =20;
	 }
	 class HatchBack extends Car{
		 int farePerKm =15;
	 }
	 
	 class Ola{

		public Car bookCar(int numberOfPassenger, int numberOfKMs) {
			 if(numberOfPassenger <4) {
				 HatchBack h1 = new HatchBack();
				 return h1;
			 }
			 else {
				 Sedan s1 = new Sedan();
				 return s1;
			 }
		}

		 public int calculateBill(Car car) {
			int x = car.getNumberOfKms();
			int y = 15;
			return (x*y);
		 }

	 }
		 
	 

