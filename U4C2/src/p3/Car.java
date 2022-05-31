package p3;

public class Car {
	
	 private int farePerKm;
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
	public int getFarePerKm() {
		return farePerKm;
	}
	public void setFarePerKm(int farePerKm) {
		this.farePerKm = farePerKm;
	}
	
}
	 
	 class Sedan extends Car{
		 int farePerKm =20;

		public int getFarePerKm() {
			return farePerKm;
		}

		public void setFarePerKm(int farePerKm) {
			this.farePerKm = farePerKm;
		}
		 
	 }
	 class HatchBack extends Car{
		 int farePerKm =15;

		public int getFarePerKm() {
			return farePerKm;
		}

		public void setFarePerKm(int farePerKm) {
			this.farePerKm = farePerKm;
			
		}
		 
	 }
	 
	 class Ola{

		public Car bookCar(int numberOfPassenger, int numberOfKMs) {
			 if(numberOfPassenger <4) {
				 Car h1 = new HatchBack();
				 return h1;
			 }
			 else {
				 Car s1 = new Sedan();
				 return s1;
			 }
		}

		 public int calculateBill(Car car) {
			int x = car.getNumberOfKms();
			int y = car.getFarePerKm();
			return (x*y);
		 }

	 }
		 
	 

