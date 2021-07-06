import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
		}
		
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		

		
		if(list.stream().filter(x -> x.getId() == id).findFirst().orElse(null) != null) {
			System.out.println("Enter the percentage: ");
			int increase = sc.nextInt();
			for(Employee obj : list) {
				 if(obj.getId()==id) {
					 obj.percentIncrease(increase);
				 }
				 
			}
		}else System.out.println("This id does not exist!");


		System.out.println("List of employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();
		
	}

}
