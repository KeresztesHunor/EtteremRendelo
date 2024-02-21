package etteremrendelo;

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
                    modell.eteleketFajlbaIr();
                }
            },
            new Action() {
                @Override public void invoke()
                {
                    modell.rendeleseketFajlbaIr();
                }
            }
        );
    }
    
    public static void main(String[] args)
    {
        new EtteremRendelo();
    }
}
