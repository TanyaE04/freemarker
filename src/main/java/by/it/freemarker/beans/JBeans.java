package by.it.freemarker.beans;


import com.fasterxml.jackson.annotation.JsonSetter;

public class JBeans {
    private String bsn;
    private String geboortedatum;
    private String geboorteplaats;
    private Address verblijfsadres = new Address ();
    private Ouder ouder1 = new Ouder ();
    private Ouder ouder2 = new Ouder ();

    public String getBsn() {
        return bsn;
    }

    @JsonSetter("inp.bsn")
    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeboorteplaats() {
        return geboorteplaats;
    }

    @JsonSetter("inp.geboorteplaats")
    public void setGeboorteplaats(String geboorteplaats) {
        this.geboorteplaats = geboorteplaats;
    }

    public Address getVerblijfsadres() {
        return verblijfsadres;
    }

    public void setVerblijfsadres(Address verblijfsadres) {
        this.verblijfsadres = verblijfsadres;
    }

    public Ouder getOuder1() {
        return ouder1;
    }

    public void setOuder1(Ouder ouder1) {
        this.ouder1 = ouder1;
    }

    public Ouder getOuder2() {
        return ouder2;
    }

    public void setOuder2(Ouder ouder2) {
        this.ouder2 = ouder2;
    }

    @Override
    public String toString() {
        return "JBeans{" +
                "bsn='" + bsn + '\'' +
                ", geboortedatum='" + geboortedatum + '\'' +
                ", geboorteplaots='" + geboorteplaats + '\'' +
                ", verblijfsadres=" + verblijfsadres +
                ", ouder1=" + ouder1 +
                ", ouder2=" + ouder2 +
                '}';
    }
}
