package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital Fh = new FortisHospital();
		
		Fh.CardioService();
		Fh.dentalService();
		Fh.GynoService();
		Fh.medicalclaim();
		Fh.emergencySevices();
		Fh.medicaltraining();
		Fh.OrthoService();
		Fh.OncologyService();
		Fh.MedicalRD();
		USMedical.billing();
		FortisHospital.billing();
		Fh.medicaltest();
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee); 
		System.out.println(USMedical.isApproved);
	
		
		// Top casting: Child class object can be referred by parent interface reference variable 
		USMedical us= new FortisHospital();
		us.physioService();
		us.CardioService();
		us.dentalService();
		us.emergencySevices();
		//us.mediclaim(); Reference type check will be failed because you can only access usmedical obverriden methods
		// and not FH individual methods
		
		// Top casting: Child class object can be referred by grandparent interface reference variable 
		WHO wh =new FortisHospital();
		wh.covidVaccinationCamp();
		// down casting: NA
		
		
		
	}

}
