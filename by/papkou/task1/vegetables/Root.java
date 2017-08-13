package by.papkou.task1.vegetables;

public class Root extends Vegetable 
{
    private int contentStarch; 
    
    public Root(int weight, int caloricity, int contentStarch)
    {
        super(weight, caloricity);
        setContentStarch(contentStarch);
    }    
    
    public void setContentStarch(int contentStarch)
    {        
        if(contentStarch > 0 && contentStarch < 100)
        {
            this.contentStarch = contentStarch;
        }
    }
    
    public int getContentStarch()
    {
        return contentStarch;
    }
}
