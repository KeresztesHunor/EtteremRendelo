package etteremrendelo;

import model.Action;
import model.Action2;
import view.GUI;
import model.Action1;
import model.Etel;
import model.Etterem;
import view.NyugtaGUI;

public class EtteremRendelo
{
    private final Etterem etterem;
    private final GUI gui;
    private final Nyugta nyugta;
    
    private EtteremRendelo()
    {
        etterem = new Etterem();
        etterem.eteleketFajlbolBeolvas();
        gui = new GUI(
            new Action1<Integer>() {
                @Override public void invoke(Integer index)
                {
                    gui.setRendelesek(etterem.getAsztal(index).getRendelesek());
                }
            },
            (Integer index, String etel) -> {
                int i = 0;
                while (i < etterem.getEtelekLength() && !etterem.getEtel(i).getNev().equals(etel))
                {
                    i++;
                }
                if (i < etterem.getEtelekLength())
                {
                    etterem.ujRendeles(index, etterem.getEtel(i));
                }
            },
            () -> {
                etterem.eteleketFajlbaIr();
            },
            () -> {
                etterem.rendeleseketFajlbaIr();
            },
            () -> {
                new NyugtaGUI(new Action() {
                    @Override public void invoke()
                    {
                        nyugta.kiir(etterem);
                    }
                })
                .nyugtatKiir(etterem.getAsztal(0).getRendelesek(),
                    etterem.getAsztal(1).getRendelesek(),
                    etterem.getAsztal(2).getRendelesek(),
                    etterem.getAsztal(3).getRendelesek()
                );
            },
            new Action2<String, Integer>() {
                @Override public void invoke(String nev, Integer ar)
                {
                    etterem.ujEtel(new Etel(nev, ar));
                    gui.etelekListahozHozzaad(nev);
                }
            }
        );
        for (int i = 0; i < etterem.getEtelekLength(); i++)
        {
            gui.etelekListahozHozzaad(etterem.getEtel(i).getNev());
        }
        nyugta = new NyugtaKonzol('=', '-');
    }
    
    public static void main(String[] args)
    {
        new EtteremRendelo();
    }
}
