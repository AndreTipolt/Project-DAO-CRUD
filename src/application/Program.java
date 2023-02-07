package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department1 = new Department(1, "Books");
		
		Seller seller1 = new Seller(1, "Andre", "andretipolt@gmail.com", new Date(), 2000.0);
		
		System.out.println(seller1);

	}

}
