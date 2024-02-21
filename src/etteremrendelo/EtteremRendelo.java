package etteremrendelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Action;
import model.Action2;
import view.GUI;
import model.Action1;
import model.Modell;

public class EtteremRendelo
{
    private final Modell modell;
    private final GUI gui;
    
    private EtteremRendelo()
    {
        modell = new Modell();
        gui = new GUI(
            new Action1<Integer>() {
                @Override public void invoke(Integer index)
                {
                    gui.setRendelesek(modell.getRendelesek(index));
                }
            },
            new Action2<Integer, String>() {
                @Override public void invoke(Integer index, String etel)
                {
                    modell.ujRendeles(index, etel);
                }
            },
            new Action() {
                @Override public void invoke()
                {
                    List<String> sorok = new ArrayList();
                    for (int i = 0; i < modell.getEtelekLength(); i++)
                    {
                        
                    }
                }
            },
            new Action() {
                @Override public void invoke()
                {
                    List<String> sorok = new ArrayList();
                    for (int i = 0; i < modell.getAsztalokLength(); i++)
                    {
                        sorok.add(modell.getAsztalNev(i));
                        for (String rendeles : modell.getRendelesek(i))
                        {
                            sorok.add(rendeles);
                        }
                        if (i < modell.getAsztalokLength() - 1)
                        {
                            sorok.add("");
                        }
                    }
                    fajlbaIr("rendelesek.txt", sorok);
                }
            }
        );
    }
    
    public static void main(String[] args)
    {
        new EtteremRendelo();
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
