package Q1;

public class Staff {
	StaffMember[] staffList;

	
	   //  Sets up the list of staff members.
	 
	   public Staff ()
	   {
	      staffList = new StaffMember[6];

	      staffList[0] = new Executive ("Sam", "62 Sakumo Crescent",
	         "0246997424", "551-0012", 3454.25);

	      staffList[1] = new Employee ("Kofi", "12 Ayikoi Teiko Street",
	         "0207345170", "456-1124", 5689.12);
	      staffList[2] = new Employee ("Akosua", "13 First Gbeshie Loop",
	         "0246997445", "236-1100", 2365.78);

	      staffList[3] = new Hourly ("Perez", "23 Teshie Street",
	         "0203001282", "123-4566", 20.56);

	      staffList[4] = new Volunteer ("Manyo", "43 Sakumo Crescent",
	         "0245678777");
	      staffList[5] = new Volunteer ("Mensa", "12 Nanka Bruce Lane",
	         "0244673670");

	      ((Executive)staffList[0]).awardBonus (500.00);

	      ((Hourly)staffList[3]).addHours (40);
	   }

	 
	   //  Pays all staff members.
	
	   public void payday ()
	   {
	      double amount;

	      for (int count=0; count < staffList.length; count++)
	      {
	         System.out.println (staffList[count]);

	         amount = staffList[count].pay();  // polymorphic

	         if (amount == 0.0)
	            System.out.println ("Thanks!");
	         else
	            System.out.println ("Paid: " + amount);

	         System.out.println ("-----------------------------------");
	      }
	   }
	}
