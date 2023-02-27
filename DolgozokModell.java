
package dolgozok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DolgozokModell  {
    
    private String nev;
    private int kor;
    private String neme;
    private int munktoltev;

    public DolgozokModell(String nev, int kor, String neme, int munktoltev) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munktoltev = munktoltev;
    }

    public DolgozokModell(String nev, int kor, String neme) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
    }

    public DolgozokModell(String sor, String sep) {
        String[] s = sor.split(sep);
        nev = s[0];
        kor = Integer.parseInt(s[1]);
        neme = s[2];
        munktoltev = Integer.parseInt(s[3]);
    }
    
    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunktoltev() {
        return munktoltev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public void setMunktoltev(int munktoltev) {
        this.munktoltev = munktoltev;
    }

    
    @Override
    public String toString() {
        return "DolgozokModell{" + "nev=" + nev + ", kor=" + kor + ", neme=" + neme + ", munktoltev=" + munktoltev + '}';
    }
    
    
}

