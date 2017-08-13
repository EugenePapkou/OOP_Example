package by.papkou.task1.vegetables;


public class Legume extends Vegetable
{
    private int sizeOfBeen; 
    
    public Legume(int weight, int caloricity, int sizeOfBeen)
    {
        super(weight, caloricity);
        setSizeOfBeen(sizeOfBeen);
    }
    
    public void setSizeOfBeen(int sizeOfBeen)
    {
        if(sizeOfBeen > 0)
        {
            this.sizeOfBeen = sizeOfBeen;
        }
    }    
    public int getSizeOfBeen()
    {
        return sizeOfBeen;
    }
}
