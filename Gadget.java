public class Gadget
{
    protected String model;
    protected double price; /* £ */
    protected int weight; /* GRAMS */
    protected String size; /* “()mm x ()mm x ()mm" */
    
    public Gadget(String model, String size, double price, int weight)
    {
        this.model = model;
        this.price = price;
        this.size = size;
        this.weight = weight;
    }
    /*
    Creates the new gadget saving the model, size, weight and price.
    */
    
    public String getModel()
    {
        return model;
    }
    /*
    It shows the model of the most recent gadget.
    */
    
    public String getSize()
    {
        return size;
    }
    /*
    It shows the size of the most recent gadget.
    */
    
    public int getWeight()
    {
        return weight;
    }
    /*
    It shows the weight of the most recent gadget.
    */
    
    public double getPrice()
    {
        return price;
    }
    /*
    It shows the price of the most recent gadget. 
    */

    public void display() {
    System.out.println("Model: " + model);
    System.out.println("Size: " + weight);
    System.out.println("Weight: " + size);
    System.out.println("Price: " + price);
        }
    /*
    It will show the most recent Gadget that was added. 
    */
}
