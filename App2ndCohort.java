public class App2ndCohort {

    public static void main(String[] args) {

        String monitor;
        int monitorPrice = 200;
        int moneyWallet = 205;
        int numberOfFriends = 10;
        int age = 40;
        String firstName = "Ted";
        String lastName = "Johnston";
        char middleInitial ='C';


        System.out.println("I am going to purchase a new monitor");
        System.out.println("The monitor costs $" + monitorPrice);
        System.out.println("I have $" + moneyWallet);

        moneyWallet = moneyWallet - monitorPrice;

        System.out.println("After my purchase I have $" + moneyWallet + " left.");

        numberOfFriends = age / numberOfFriends;
        System.out.println("\nTed Johnston has made " + numberOfFriends + " friends per year." );

        System.out.println("The subject's name is " + firstName + " " + middleInitial + " " + lastName);



    }

}
