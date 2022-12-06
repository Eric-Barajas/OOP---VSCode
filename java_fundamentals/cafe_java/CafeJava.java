public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 7.5;
        double cappucinoPrice = 8.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage + (". ") + displayTotalMessage + cappucinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
        
        System.out.println(displayTotalMessage + lattePrice*2);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage + (". ") + displayTotalMessage + lattePrice*2);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(displayTotalMessage + dripPrice);
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));

// Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.


    }
}
