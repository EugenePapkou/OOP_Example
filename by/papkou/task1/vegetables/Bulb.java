package by.papkou.task1.vegetables;

// Луковичное
public class Bulb extends Vegetable
{
    private String smell; // about specific smell
    private String colourOfBulb;
            
    public Bulb(int weight, int caloricity, String smell, String colourOfBulb)
    {
        super(weight, caloricity);
        setSmell(smell);
        setColourOfBulb(colourOfBulb);
    }
    public void setSmell(String smell)
    {
        this.smell = smell;
    }    
    public String getSmell()
    {
        return smell;
    }
    public void setColourOfBulb(String colourOfBulb)
    {
        this.colourOfBulb = colourOfBulb;
    }    
    public String getColourOfBulb()
    {
        return colourOfBulb;
    }
}
