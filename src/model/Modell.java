package model;

import java.util.ArrayList;
import java.util.List;

public class Modell
{
    private final List<Etel> etelek;
    private final Asztal[] asztalok;
    
    public Modell()
    {
        etelek = new ArrayList();
        asztalok = new Asztal[4];
        asztalok[0] = new Asztal("Piros");
        asztalok[1] = new Asztal("Zöld");
        asztalok[2] = new Asztal("Kék");
        asztalok[3] = new Asztal("Fehér");
    }
    
    public int getEtelekLength()
    {
        return etelek.size();
    }
    
    public int getAsztalokLength()
    {
        return asztalok.length;
    }
    
    public Etel getEtel(int index)
    {
        return etelek.get(index);
    }
    
    public void ujEtel(Etel etel)
    {
        etelek.add(etel);
    }
    
    public String getAsztalNev(int asztalIndex)
    {
        return asztalok[asztalIndex].getAsztalNev();
    }
    
    public List<String> getRendelesek(int asztalIndex)
    {
        return asztalok[asztalIndex].getRendelesek();
    }
    
    public void ujRendeles(int asztalIndex, String rendeles)
    {
        asztalok[asztalIndex].ujRendeles(rendeles);
    }
}
