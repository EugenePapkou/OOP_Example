package by.papkou.task1.controller;

import by.papkou.task1.report.WriteToXml;
import by.papkou.task1.makesalad.Cook;
import by.papkou.task1.makesalad.Salad;

public class Task_1 
{
    public static void main(String[] args) 
    {
        Cook cook = new Cook(); 
        Salad salad = cook.cookSalad();       
        WriteToXml xmlWriter = new WriteToXml();
        xmlWriter.createXml(salad.getSalad());
    }
}
