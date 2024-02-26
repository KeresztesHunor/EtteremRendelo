package etteremrendelo;

import model.Etel;
import model.Modell;

public class NyugtaKonzol implements Nyugta
{
    private final String nagyValaszto;
    private final String kisValaszto;

    public NyugtaKonzol(char nagyValaszto, char kisValaszto)
    {
        String nv = "";
        String kv = "";
        for (int i = 0; i < 40; i++)
        {
            nv += nagyValaszto;
            kv += kisValaszto;
        }
        this.nagyValaszto = nv;
        this.kisValaszto = kv;
    }
    
    @Override public void kiir(Modell etterem)
    {
        System.out.println("Nyugta");
        for (int i = 0; i < 4; i++)
        {
            System.out.println(nagyValaszto);
            System.out.println(etterem.getAsztal(i).getAsztalNev());
            System.out.println(kisValaszto);
            int osszAr = 0;
            for (Etel rendeles : etterem.getRendelesek(i))
            {
                osszAr += rendeles.getAr();
                System.out.printf("%-28s %8d Ft\n", rendeles.getNev(), rendeles.getAr());
            }
            System.out.println(kisValaszto);
            System.out.printf("Összesen:%28d Ft\n", osszAr);
        }
    }
}
