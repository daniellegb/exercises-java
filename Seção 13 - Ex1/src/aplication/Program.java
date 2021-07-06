package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department's name: ");
		String dep = sc.nextLine();
		Department department = new Department(dep);
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Level: ");
		String lev = sc.nextLine();
		WorkerLevel level = WorkerLevel.valueOf(lev);
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, level, baseSalary, department);
		
		System.out.println("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for(int i =1; i<=numberOfContracts; i++) {
			HourContract contract = new HourContract();
			System.out.println("Enter contract number #" + i + " data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			String date = sc.next();
			contract.setDate(sdf.parse(date));
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			contract.setValuePerHour(valuePerHour);
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
			contract.setHours(hours);
			worker.addContract(contract);
		}
		
		System.out.println("");
		System.out.println("Enter month and year to calculate income: ");
		String date = sc.next();
		int month = Integer.parseInt(date.substring(0, 2));
		int year = Integer.parseInt(date.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment());
		System.out.println("Income for " + month + "/" + year + ": " + worker.income(year, month));
		
	}

}
