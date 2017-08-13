package by.papkou.task1.makesalad;

import by.papkou.task1.vegetables.Vegetable;
import java.util.ArrayList;

public class Salad 
{
    private ArrayList<Vegetable> salad;
    
    public Salad(ArrayList<Vegetable> salad)
    {
        this.salad = new ArrayList();
        setSalad(salad);
    }
    
    public ArrayList<Vegetable> getSalad()
    {
        return salad;
    }
    
    private void setSalad(ArrayList<Vegetable> salad)
    {
        this.salad = salad;
    }
}
