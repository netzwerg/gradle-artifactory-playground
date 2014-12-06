package ch.netzwerg.ejb;

import javax.ejb.Stateless;

@Stateless
public class BarEJB {

    public String getBar() {
        return "bar";
    }

}
