
/**

 * @author Milan Palmer
 * @version 1.0
 */
public class Customer
{
    
    private int amountSpent; // amount spent is stored in this integer, I want value of varible, not a fixed amount
    private Shop currentShop;
    private boolean hasUnlimitedBudget;
    public int budget;
    public int enoughMoney;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        this.amountSpent = 0;
        this.currentShop = null; // in the state of not entering a shop, he is always null. In the future, I can change this, null is just to say 'no value yet'
        this.hasUnlimitedBudget = true;
        this.budget = -1;
    }

    public Shop getCurrentShop(){
        return currentShop;
    }

    public boolean hasUnlimitedBudget(){ 
        return hasUnlimitedBudget;
    }

    public void setBudget(int newBudget){
        this.budget = newBudget;
        hasUnlimitedBudget = false;
    }

    public int newBudget(){
        return budget;
    }

    public int getBudget(){
        return budget;
    }    

    public void enter (Shop newShop){ 
        // if they aren't in a shop, 'null'
        // allow them to enter the new shop
        if (this.currentShop == null) { 
            this.currentShop = newShop;
        }
    }

    public int getAmountSpent(){ 
        return amountSpent;
    }

    public int enoughMoney(){
        return budget;
    }

    public void buy(int amount){
        if (this.currentShop!=null ) // if customer is in a shop
        {
            int total=currentShop.getPrice()*amount;

            if(budget>=total && hasUnlimitedBudget == false) { // if my budget is greater/equal to total
                budget=budget-total;
                amountSpent=amountSpent + total; 
                currentShop.sell(amount);
            }
            else if (budget<total && hasUnlimitedBudget == false){
                //
            }
            if (budget == -1) {
                amountSpent=amountSpent + total;
                currentShop.sell(amount);
            }
        }
    }

    public void exit() {
        currentShop = null;
    }
 
    public int getPrice(){
        return currentShop.getPrice();
    }

}