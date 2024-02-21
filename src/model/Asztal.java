package model;

import java.util.ArrayList;
import java.util.List;

public class Asztal
{
    private final String asztalNev;
    
    private final List<String> rendelesek;
    
    public Asztal(String asztalNev)
    {
        this.asztalNev = asztalNev;
        rendelesek = new ArrayList();
    }

    public String getAsztalNev()
    {
        return asztalNev;
    }
    
    public void ujRendeles(String etel)
    {
        rendelesek.add(etel);
    }
    
    public List<String> getRendelesek()
    {
        return rendelesek;
    }
}
