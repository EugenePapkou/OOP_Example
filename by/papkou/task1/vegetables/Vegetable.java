package by.papkou.task1.vegetables;

public abstract class Vegetable
{
    private int weight; // grams
    private int caloricity; // kCal
    
    public Vegetable(int weight, int caloricity)
    {
        setWeight(weight);
        setCaloricity(caloricity);
    }
    
    public void setWeight(int weight)
    {
        if(weight > 0)
        {
            this.weight = weight;
        }
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setCaloricity(int caloricity)
    {
        if(caloricity > 0)
        {
            this.caloricity = caloricity;
        }
    }    
    public int getCaloricity()
    {
        return caloricity;
    }
}
