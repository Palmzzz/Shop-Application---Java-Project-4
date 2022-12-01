/**

 * @author Milan Palmer
 * @version 1.0
 */

public class Shop
{
    private int price, noOfItemsSold;

    public Shop(int price)
    {
        this.price = price;
        noOfItemsSold = 0;
    }

    public int getPrice(){
        return price;
    }
    
    public int getNoOfItemsSold(){
        return noOfItemsSold;
    }
    
    public void sell(int amount){
        noOfItemsSold += amount;
    }
    
    public int getTotal(){
        return price * noOfItemsSold;
    }
    
    public String toString(){
        String msg =  "This shop sells items that cost " + price + "p and has sold ";
        msg+= noOfItemsSold + " items. It's register holds " + getTotal() + "p.";
        return msg;
    }
    
}
