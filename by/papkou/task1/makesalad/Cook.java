package by.papkou.task1.makesalad;

import by.papkou.task1.vegetables.Bulb;
import by.papkou.task1.vegetables.Leafy;
import by.papkou.task1.vegetables.Legume;
import by.papkou.task1.vegetables.Root;
import by.papkou.task1.vegetables.SeaVegetable;
import by.papkou.task1.vegetables.Vegetable;
import java.util.ArrayList;


public class Cook 
{
    private ArrayList<Vegetable> vegetables;
    
    private void buyVegetables()
    {        
        Vegetable potato = new Root(150, 200, 30);
        Vegetable onion = new Bulb(130, 20, "pingent", "red");
        Vegetable bean = new Legume(50, 7, 3);
        Vegetable nori = new SeaVegetable(5, 10, 1);
        Vegetable cabbage = new Leafy(5, 10, 10, 5);
        
        vegetables = new ArrayList();
        vegetables.add(potato);
        vegetables.add(onion);
        vegetables.add(bean);
        vegetables.add(nori);
        vegetables.add(cabbage);
    }
    
    public Salad cookSalad() 
    {   
        buyVegetables();
        Salad tastyColourSalad = new Salad(vegetables);
        return tastyColourSalad;
    }
}
