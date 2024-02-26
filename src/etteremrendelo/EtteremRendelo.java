package etteremrendelo;

import model.Action;
import model.Action2;
import view.GUI;
import model.Action1;
import model.Etel;
import model.Modell;
import view.NyugtaGUI;

public class EtteremRendelo
{
    private final Modell modell;
    private final GUI gui;
    private final Nyugta nyugta;
    
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
            (Integer index, String etel) -> {
                int i = 0;
                while (i < modell.getEtelekLength() && !modell.getEtel(i).getNev().equals(etel))
                {
                    i++;
                }
                if (i < modell.getEtelekLength())
                {
                    modell.ujRendeles(index, modell.getEtel(i));
                }
            },
            () -> {
                modell.eteleketFajlbaIr();
            },
            () -> {
                modell.rendeleseketFajlbaIr();
            },
            () -> {
                new NyugtaGUI(new Action() {
                    @Override public void invoke()
                    {
                        nyugta.kiir(modell);
                    }
                })
                .nyugtatKiir(
                    modell.getRendelesek(0),
                    modell.getRendelesek(1),
                    modell.getRendelesek(2),
                    modell.getRendelesek(3)
                );
            },
            new Action2<String, Integer>() {
                @Override public void invoke(String nev, Integer ar)
                {
                    modell.ujEtel(new Etel(nev, ar));
                    gui.etelekListahozHozzaad(nev);
                }
            }
        );
        nyugta = new NyugtaKonzol('=', '-');
    }
    
    public static void main(String[] args)
    {
        new EtteremRendelo();
    }
}
