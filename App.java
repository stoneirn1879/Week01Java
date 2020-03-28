public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Storing Item Prices, Wallet Balance, Number of Friends, Age, First Name Middle Initial
		//Last Name
		
		int courseItemPriceA = 780;
		int walletBalanceA = 1000;
		int friendsA = 15;
		int ageA = 39;
		String firstNameA = "Aaron";
		char middleInitialA ='W';
		String lastNameA = "Thomas";
		
				
		int courseItemPriceB = 15000;
		int walletBalanceB = 1500;
		int friendsB = 7;
		int ageB = 35;
		String firstNameB = "John";
		char middleInitialB ='C';
		String lastNameB = "Programmer";
		String fullNameB = firstNameB + " " + lastNameB;
		
		//Operations
		//a.	New amount of money in wallet after buying the item
		//b.	Number of friends you’ve made each year based on your age variable and your number of friends variable
		//c.	Full name based on first name, middle initial, and last name

		walletBalanceA = walletBalanceA - courseItemPriceA;
		friendsA = ageA / friendsA;
		String fullNameA = firstNameA + " " + middleInitialA + " " + lastNameA;
		
		System.out.println("Subject's Wallet Balance Currently is" + " " + walletBalanceA);
		System.out.println("Subject's Friends Per year is" + " " + friendsA);
		System.out.println("Subject's Name is" + " " + fullNameA);
		
		
		walletBalanceB = walletBalanceB - courseItemPriceB;
		friendsB = ageB / friendsB;
		String fullNameB1 = firstNameB + " " + middleInitialB + " " + lastNameB;
		//Question here, I coped the lines from A but the IDE suggested B1 for String fullNameB 
		//just wanted to know why that it doesn't for A
		
		System.out.println("Subject's Wallet Balance Currently is" + " " + walletBalanceB);
		System.out.println("Subject's Friends Per year is" + " " + friendsB);
		System.out.println("Subject's Name is" + " " + fullNameB1);
		
		
		
	}

}
