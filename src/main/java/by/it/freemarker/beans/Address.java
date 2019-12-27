package by.it.freemarker.beans;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Address {
    private String postcode;
    private String huisnummer;
    private String huisletter;
    private String huisnummertoenoeging;

    public String getPostcode() {
        return postcode;
    }

    @JsonSetter("aoa.postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    @JsonSetter("aoa.huisnummer")
    public void setHuisnummar(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getHuisletter() {
        return huisletter;
    }

    @JsonSetter("aoa.huisletter")
    public void setHuisletter(String huisletter) {
        this.huisletter = huisletter;
    }

    public String getHuisnummertoenoeging() {
        return huisnummertoenoeging;
    }

    @JsonSetter("aoa.huisnummertoevoeging")
    public void setHuisnummertoenoeging(String huisnummertoenoeging) {
        this.huisnummertoenoeging = huisnummertoenoeging;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", huisnummar='" + huisnummer + '\'' +
                ", huisletter='" + huisletter + '\'' +
                ", huisnummertoenoeging='" + huisnummertoenoeging + '\'' +
                '}';
    }
}
