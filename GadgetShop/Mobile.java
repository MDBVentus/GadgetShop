import java.util.Scanner;
    
public class Mobile extends Gadget
{
    private int callingCredit;

    public Mobile(String model, String size, double price, int weight, int callingCredit) 
    {
        super(model, size, price, weight);
        this.callingCredit = callingCredit;
    }
    
    @Override public String toString() {return "Mobile " + getModel();}
    
    public int getCallingCredit()
    {
        return callingCredit;
    }
    
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
    
    public void displayMobile()
    {
            System.out.println("Model: " + model);
            System.out.println("Size: " + size);
            System.out.println("Price: " + price);
            System.out.println("Weight: " + weight);
            System.out.println("Calling Credit: " + callingCredit);
    }
}
