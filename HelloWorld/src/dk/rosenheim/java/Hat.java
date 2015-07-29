package dk.rosenheim.java;

public class Hat {
    public int tekst = 5;
    public void hans(int tekst){
        tekst = tekst + 100;    // tekst(5) + 100 = 105
        this.tekst = tekst + this.tekst;    // tekst(5)

        System.out.println(tekst);
        System.out.println(this.tekst);
    }
}
