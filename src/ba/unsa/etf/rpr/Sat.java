package ba.unsa.etf.rpr;


public class Sat{
private int sati, minute, sekunde;
public Sat(int sati, int minute, int sekunde) {Postavi(sati,minute,sekunde);}
public void Postavi(int x, int y, int z)
{
    this.sati=x;
    this.minute=y;
    this.sekunde=z;
}

public void Sljedeci()
{
 sekunde=sekunde+1;
    if (sekunde==60) { sekunde=0; minute++; }
    if (minute==60) { minute=0; sati++; }
    if (sati==24) sati=0;
}

public void Prethodni() {
        sekunde=sekunde-1;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
}

public void PomjeriZa(int pomak) {
    if (pomak>0)
    {
        for (int i=0; i<pomak; i++) Sljedeci();}

    else for (int i=0; i<-pomak; i++) Prethodni();
}
public int getSate()  { return sati; }
public int getMinute() { return minute; }
public int getSekunde()  { return sekunde; }
public void Ispisi()  { System.out.println(sati+":"+minute+":"+sekunde); }





    public static void main(String[] args) {
        Sat s= new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();

    }
}








