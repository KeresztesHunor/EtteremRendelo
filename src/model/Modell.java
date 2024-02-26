package model;

import etteremrendelo.EtteremRendelo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Etel getEtel(int index)
    {
        return etelek.get(index);
    }
    
    public int getEtelekLength()
    {
        return etelek.size();
    }
    
    public void ujEtel(Etel etel)
    {
        etelek.add(etel);
    }
    
    public Asztal getAsztal(int index)
    {
        return asztalok[index];
    }
    
    public List<Etel> getRendelesek(int asztalIndex)
    {
        return asztalok[asztalIndex].getRendelesek();
    }
    
    public void ujRendeles(int asztalIndex, Etel rendeles)
    {
        asztalok[asztalIndex].ujRendeles(rendeles);
    }
    
    public void eteleketFajlbaIr()
    {
        List<String> sorok = new ArrayList();
        for (int i = 0; i < etelek.size(); i++)
        {
            sorok.add(etelek.get(i).toString());
        }
        fajlbaIr("etelek.txt", sorok);
    }
    
    public void rendeleseketFajlbaIr()
    {
        List<String> sorok = new ArrayList();
        for (int i = 0; i < asztalok.length; i++)
        {
            sorok.add(asztalok[i].getAsztalNev());
            for (Etel rendeles : asztalok[i].getRendelesek())
            {
                sorok.add(rendeles.getNev());
            }
            if (i < asztalok.length - 1)
            {
                sorok.add("");
            }
        }
        fajlbaIr("rendelesek.txt", sorok);
    }
    
    private static void fajlbaIr(String filePath, List<String> sorok)
    {
        Path path = Path.of(filePath);
        try
        {
            if (Files.exists(path))
            {
                Files.delete(path);
            }
            Files.write(path, sorok);
        }
        catch (IOException ex)
        {
            Logger.getLogger(EtteremRendelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
