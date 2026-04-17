import java.util.Scanner;
    
public class Mobile extends Gadget
{
    private int callingCredit;

    public Mobile(String model, String size, double price, int weight, int callingCredit) 
    {
        super(model, size, price, weight);
        this.callingCredit = callingCredit;
    }
    /*
    Creates the new mobile saving the model, size, weight and price in Gadget 
    while maintaining the calling credit within mobile.
    */
    
    
    @Override public String toString() {return "Mobile " + getModel();}
    /*
    Used to return a more readable message when adding a new gadget.
    */
    
    
    public int getCallingCredit()
    {
        return callingCredit;
    }
    /*
    It shows the remaining calling credit the mobile has.
    */
    
    
    public void addCallingCredit(int amount)
    {
        Scanner scan = new Scanner(System.in);
        
        do 
            {
                if (amount > 0) 
                {            
                    callingCredit = callingCredit + amount;
                }
                else
                {
                    System.out.print("Enter valid value: ");
                    callingCredit = scan.nextInt();
                    System.out.println(callingCredit);  
                }
            }
        while (callingCredit <= 0);
        scan.close();
    }
    /*
    It asks the user how much credit they want to add and 
    adds it to the total credit remaining. If it is an invalid value, 
    it will give the user a message and request they insert a valid value.
    */
    
    
    public String phonecall(int amountMinutes, int phoneNumber)
    {
        if (callingCredit > amountMinutes)
        {
            System.out.println("Number: " + phoneNumber);
            System.out.println("Duration: " + amountMinutes);
            callingCredit = callingCredit - amountMinutes;
            return "Call Successful! Current calling credit is: " + callingCredit;
        }
        else
        {
            return "Insufficient Credit.";
        }
    }
    /* 
    It simulates a phonecall, where if the callingCredit is bigger than 
    amountMinutes inserted it will call the phonenumber, 
    showing it and the amount of minutes the call lasted to the user, 
    while removing the amount of minutes from the total credit. 
    If the callingCredit is smaller it will return 
    a message saying there aren't enough credits. 
    */
    
    
    public void displayMobile()
    {
            System.out.println("Model: " + model);
            System.out.println("Size: " + size);
            System.out.println("Price: " + price);
            System.out.println("Weight: " + weight);
            System.out.println("Calling Credit: " + callingCredit);
    }
    /*
     It will show the most recent mobile that was added. 
     */
}
