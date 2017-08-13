package by.papkou.task1.vegetables;

public class SeaVegetable extends Vegetable 
{
    private int iodinContent; 
    
    public SeaVegetable(int weight, int caloricity, int iodinContent)
    {
        super(weight, caloricity);
        setContentIodin(iodinContent);
    }
    
    public void setContentIodin(int contentIodin)
    {        
        if(contentIodin < 100 && contentIodin >= 0)
        {
            this.iodinContent = contentIodin;
        }
    }
    
    public int getContentIodin()
    {
        return iodinContent;
    }
}
