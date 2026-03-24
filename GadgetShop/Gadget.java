public class Gadget
{
    protected String model;
    protected double price; /* £ */
    protected int weight; /* GRAMS */
    protected String size; /* “()mm x ()mm x ()mm" */
    
    public Gadget(String model, String size, double price, int weight)
    {
        this.model = model; // this is the name of the model 
        this.price = price;// what how and why 
        this.size = size;
        this.weight = weight;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getSize()
    {
        return size;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public double getPrice()
    {
        return price;
    }

    public void display() {
    System.out.println("Model: " + model);
    System.out.println("Size: " + weight);
    System.out.println("Weight: " + size);
    System.out.println("Price: " + price);
        }
}
