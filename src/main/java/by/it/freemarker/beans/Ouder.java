package by.it.freemarker.beans;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Ouder {
    private String bsn;

    public String getBsn() {
        return bsn;
    }
    @JsonSetter("inp.bsn")
    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    @Override
    public String toString() {
        return "Ouder{" +
                "bsn='" + bsn + '\'' +
                '}';
    }
}
