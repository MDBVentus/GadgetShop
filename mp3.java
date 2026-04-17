public class mp3 extends Gadget
{
    private int availableMemory;
    
    public mp3(String model, String size, double price, int weight, int availableMemory)
    {      
        super(model, size, price, weight);
        this.availableMemory = availableMemory;
    }
    /*
    Creates the new mp3 saving the 
    model, size, weight and price in Gadget 
    while maintaining the available memory within mp3.
    */
    
   
    @Override public String toString() {return "MP3 " + getModel();}
    /*
    Used to return a more readable message when adding a new gadget.
    */
    
    
    public int getMemory()
    {
        return availableMemory;
    }
    /*
    It shows the remaining memory the mp3 has.
    */
    
    
    public String download(int memoryNeeded)
    {
        if (availableMemory > memoryNeeded)
        {
            availableMemory = availableMemory - memoryNeeded;
            return "Download Successful! Current available memory is: " + availableMemory;
        }
        else
        {
            return "Insufficient memory.";
        }
    }
    /*
    It takes the inputted space needed for the song 
    and if the mp3 has enough space, it will remove the space from the mp3. 
    If not, it will return a message saying there isn't enough space.
    */
    
    
    public void deleteMusic(int memoryUsed)
    {
        if (availableMemory > memoryUsed)
        {
            availableMemory = availableMemory + memoryUsed;
        }
    }
    /*
    It takes the inputted memory used and adds it to the available memory, 
    acting as if the mp3 has removed that space.
    */
    
    
    public void displayMP3()
    {
            System.out.println("Model: " + model);
            System.out.println("Size: " + size);
            System.out.println("Price: " + price);
            System.out.println("Weight: " + weight);
            System.out.println("availableMemory: " + availableMemory);
    }    
    /* 
    It will show the most recent mp3 that was added.
    */
}
