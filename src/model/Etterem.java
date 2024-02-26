package model;

import etteremrendelo.EtteremRendelo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Etterem
{
    private final List<Etel> etelek;
    private final Asztal[] asztalok;
    
    public Etterem()
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
    
    public void ujRendeles(int asztalIndex, Etel rendeles)
    {
        asztalok[asztalIndex].ujRendeles(rendeles);
    }
    
    public void eteleketFajlbolBeolvas()
    {
        try
        {
            File f = new File("etelek.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {
                String[] line = sc.nextLine().split("\\|");
                etelek.add(new Etel(line[0], Integer.parseInt(line[1])));
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("yikes");
        }
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
    
    private int asztalIndex(String asztalNev)
    {
        int i = 0;
        while (i < asztalok.length && !asztalok[i].getAsztalNev().equals(asztalNev))
        {
            i++;
        }
        return i < asztalok.length ? i : -1;
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
