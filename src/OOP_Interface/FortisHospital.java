package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	//int min_fee =100;

	// US
	@Override
	public void physioService() {
		System.out.println("FH-physioService");

	}

	@Override
	public void CardioService() {
		System.out.println("FH-CardioService");

	}

	@Override
	public void dentalService() {
		System.out.println("FH-dentalService");

	}

	// UK
	@Override
	public void neuroService() {
		System.out.println("FH-neuroService");

	}

	@Override
	public void OrthoService() {
		System.out.println("FH-OrthoService");

	}

// India
	@Override
	public void OncologyService() {
		System.out.println("FH-OncologyService");

	}

	@Override
	public void GynoService() {
		System.out.println("FH-GynoService");

	}

// common method 
	@Override
	public void emergencySevices() {

		System.out.println("FH-emergencySevices");
	}

	// Individual methods of Fortis hospital
	public void medicaltraining() {

		System.out.println("FH-medicaltraining");
	}
	public void medicalclaim() {

		System.out.println("FH-medicalclaim");
	}

	@Override
	public void covidVaccinationCamp() {
		System.out.println("FH- covidVaccination");
		
	}
	
	// method hiding
	public static void billing()
	{
		System.out.println("FH---- billing");
	}
	
	@Override
	public void medicaltest()
	{
		System.out.println("FHMedical Test");
	}
	
}
