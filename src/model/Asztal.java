package model;

import java.util.ArrayList;
import java.util.List;

public class Asztal
{
    private final String asztalNev;
    
    private final List<Etel> rendelesek;
    
    public Asztal(String asztalNev)
    {
        this.asztalNev = asztalNev;
        rendelesek = new ArrayList();
    }

    public String getAsztalNev()
    {
        return asztalNev;
    }
    
    public void ujRendeles(Etel etel)
    {
        rendelesek.add(etel);
    }
    
    public List<Etel> getRendelesek()
    {
        return rendelesek;
    }
}
