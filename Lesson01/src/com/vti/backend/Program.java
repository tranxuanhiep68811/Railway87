package com.vti.backend;

import java.util.Date;

public class Program {
	public static void main(String args[]) {
		
			Department department1 = new Department();
			department1.id = 1;
			department1.departmentName = "Phòng HR";
			
			Department department2 = new Department();
			department2.id = 2;
			department2.departmentName = "Phòng R&D";
			
			Position position1 = new Position();
			position1.positionId = 1;
			position1.positionName = "PM";
			
			Position position2 = new Position();
			position1.positionId = 2;
			position1.positionName = "DEV";
			
			Users users1 = new Users();
			users1.id = 1;
			users1.email = "tranhiep@gmail.com";
			users1.fullName = "tran xuan hiep";
			users1.gender = Gender.MALE;
			users1.dateofBirth = new Date("2024/07/19");
			users1.department = department1;
			

			System.out.println("---thong tin cua department");
			System.out.println("ID:"+ department1.id);
			System.out.println("Name:"+ department1.departmentName);
			
			System.out.println("id:" + users1.id);
			System.out.println("email:" + users1.email);
			System.out.println("fullName:" + users1.fullName);
			System.out.println("gender:" + users1.gender);
			System.out.println("dateofBirth:" + users1.dateofBirth);
			System.out.println("department:" + users1.department);
	}
	
}

		
		
