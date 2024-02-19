package model;

import java.util.ArrayList;
import java.util.List;

public class Asztal
{
    private final List<String> rendelesek;
    
    public Asztal()
    {
        rendelesek = new ArrayList();
    }
    
    public void ujRendeles(String etel)
    {
        rendelesek.add(etel);
    }
}
