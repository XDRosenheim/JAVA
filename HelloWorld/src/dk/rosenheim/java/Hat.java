package dk.rosenheim.java;

public class Hat {
    int tekst = 5;
    public void hans(int tekst){
        tekst = tekst + 100;
        this.tekst = tekst + this.tekst;

        System.out.println(tekst);
        System.out.println(this.tekst);
    }
}
