package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.emergencyService();
		fh.gynecServices();
		
		fh.medicalInsurance();
		fh.pathalogyService();
		
		System.out.println(USMedical.min_fee);// to find minimum fee in us.
		
		USMedical.billing();
		fh.taxCollection();
		fh.RD();
		
		System.out.println("===============================================");
		
		//Top casting:child class object is reffered by parent interface reference variable
		// I'm able to access only USMethods
		USMedical us = new FortisHospital();
		
		us.neuroService();
		us.orthoService();
		us.emergencyService();
		us.radioService();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
