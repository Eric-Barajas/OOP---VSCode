import java.util.ArrayList;

public class CafeUtil{
    // public int getStreakGoal(){
    //     int sum = 0;
    //     for(int i = 1; i < 11; i++){
    //         sum += i;
    //     }
    // return sum;
    // }


    // public double getOrderTotal(double[] prices){
    //     int sum = 0;
    //     for(int i = 0; i < prices.length; i++){
    //         sum += prices[i];
    //     }
    // return sum;
    // }

    // public void displayMenu(ArrayList<String> menuitems){
    //     for (int i = 0; i < menuitems.size(); i++){
    //         System.out.print(i + " ");
    //         System.out.println(menuitems.get(i));
    //     }
    // }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        // system = object
        // get whatever user types will readline after inputing a name
        customers.add(userName);
        System.out.println("Hello, " + userName + " !");
        System.out.println("There are " + customers.size() + " people in front of you");
        System.out.println(customers); 


    }

}