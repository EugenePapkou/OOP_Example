package by.papkou.task1.vegetables;


public class Leafy extends Vegetable
{
    private int lengthOfLeaf; 
    private int numberOfLeaves; 
    
    public Leafy(int weight, int caloricity, int lengthOfLeaf, 
            int numberOfLeaves)
    {
        super(weight, caloricity);
        setLengthLeaf(lengthOfLeaf); 
        setNumberOfLeaves(numberOfLeaves);
    }
    
    public void setLengthLeaf(int lengthLeaf)
    {
        if(lengthLeaf > 0)
        {
            this.lengthOfLeaf = lengthLeaf;
        }
    }    
    public int getLengthLeaf()
    {
        return lengthOfLeaf;
    }
    
    public void setNumberOfLeaves(int numberOfLeaves)
    {
        if(numberOfLeaves > 0)
        {
            this.numberOfLeaves = numberOfLeaves;
        }
    }    
    public int getNumberOfLeaves()
    {
        return numberOfLeaves;
    }
 }
