package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		//CRUD operations  create retrive update delete 
		//POST call - Create
		Employee e1 = new Employee("Arush", 25, 12.88, "Pune");
		Employee e2 = new Employee("Sarika",25,12.89,"Banglore","India");
		
		//GET  - Retrive
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
        System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println("---------------------------");
		// PUT - update
		e1.setAge(26);
		e1.setSalary(20.7);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
        System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		
//		e1.setName("Aarush");
//		e1.setAge(30);
//		e1.setCity("Banglore");
//		e1.setSalary(1800000);
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.getCity());
//		System.out.println(e1.getSalary());


	}

}
