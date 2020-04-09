import java.util.Scanner;

public class SystemTest {
	
	public static void main(String[] args)
	{
		/*
		Part B Testing
		System test = new System ("Apple", "MacBook", 256);
		test.setHardDisk(256.0);
		test.setMemory(128);
		test.setPurchaseCost(500);
	    java.lang.System.out.println(test.displayDetails());
	    java.lang.System.out.println(test.diagnoseSystem());
	    java.lang.System.out.println(test.displaySystemProperties());
	    
	    */
		
		System test = new System ("Apple", "MacBook", 256);
		
		Scanner sc =  new Scanner(java.lang.System.in);
		test.printMenu();
		int choice = sc.nextInt();
		
		//If incorrect input is added
		while(choice < 0 && choice > 5)
		{
			java.lang.System.out.println("Please input a valid number");
			choice = sc.nextInt();
		}
		
		//If correct input
		while(choice > 0 || choice < 5)
		{	
			switch(choice)
			{
			  case 1:
				  	while(choice == 1)
				  	{
				  		java.lang.System.out.println(test.displayDetails());
				  		test.printMenu();
				  		java.lang.System.out.println(("Please input next choice."));
				  		choice = sc.nextInt();
				  	}
					
			  case 2: 
				  	while(choice == 2)
				  	{
				  		java.lang.System.out.println(test.displaySystemProperties());
				  		test.printMenu();
				  		java.lang.System.out.println(("Please input additional information"));
				  		choice = sc.nextInt();
				  	}
				  	
			  case 3:
				  	while(choice == 3)
				  	{
				  		java.lang.System.out.println(test.diagnoseSystem());
				  		test.printMenu();
				  		java.lang.System.out.println(("Please input additional information"));
				  		choice = sc.nextInt();
				  	}  	
				  	
			  case 4:
				  	while(choice == 4)
				  	{	
				  		java.lang.System.out.println("Please input the disk size");
				  		test.setHardDisk(sc.nextDouble());
				  		java.lang.System.out.println("Please input the memory size");
				  		test.setMemory(sc.nextInt());
				  		
				  		test.printMenu();
				  		java.lang.System.out.println(("Please input additional information"));
				  		choice = sc.nextInt();
				  	}
				  	
			  case 5:
				  	while(choice == 5)
				  	{
				  		java.lang.System.exit(0);	
				  	}	
				}
		  		
			}
									
		
	}

}
