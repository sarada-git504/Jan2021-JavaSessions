package OOP_Interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {

	@Override
	public void orthoService() {
		System.out.println("FH --------------- orthoServices");
		
	}

	@Override
	public void neuroService() {
		System.out.println("FH --------------- neuroServices");
		
	}

	@Override
	public void emergencyService() {
		System.out.println("FH --------------- emergencyServices");
		
	}

	@Override
	public void radioService() {
		System.out.println("FH --------------- radioServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH --------------- phsioServices");
		
	}

	@Override
	public void gynecServices() {
		System.out.println("FH --------------- gynecServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH --------------- cardioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH --------------- oncologyServices");
	}
	
	
	// non overridden:these are not coming from anywhere these are for FH
	
	public void medicalInsurance() {
		System.out.println("FH -------------------- medicalInsurance");
	}
	
	
	public void pathalogyService() {
		System.out.println("FH---------------------pathalogyService");
	}
	
	@Override
	public void taxCollection() {
   	 System.out.println("FH-----------20%taxcollection");
    }

	@Override
	public void covidTest() {
		System.out.println("FH-----------covidTest");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
