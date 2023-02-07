package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
//		Seller seller = sellerdao.findById(3);
		
//		System.out.println(seller);
		
		Department department = new Department(2, null);
//		List<Seller> list = sellerdao.findByDepartment(department);
//		List<Seller> list = sellerdao.findAll();
		
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", 4000.0, new Date(), department);
		
//		for (Seller seller2 : list) {
//			System.out.println(seller2);
//		}
		
//		Seller seller = sellerdao.findById(1);
//		sellerdao.insert(newSeller);
		
		sellerdao.deleteById(9);
		

	}

}
