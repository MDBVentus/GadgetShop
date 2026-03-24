public class mp3 extends Gadget
{
    private int availableMemory;
    
    
    public mp3(String model, String size, double price, int weight, int availableMemory)
    {      
        super(model, size, price, weight);
        this.availableMemory = availableMemory;
    }
   
    @Override public String toString() {return "MP3 " + getModel();}
    
    public int getMemory()
    {
        return availableMemory;
    }
    
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
    
    public void deleteMusic(int memoryUsed)
    {
        if (availableMemory > memoryUsed)
        {
            availableMemory = availableMemory + memoryUsed;
        }
    }
    
    public void displayMP3()
    {
            System.out.println("Model: " + model);
            System.out.println("Size: " + size);
            System.out.println("Price: " + price);
            System.out.println("Weight: " + weight);
            System.out.println("availableMemory: " + availableMemory);
    }    
}
