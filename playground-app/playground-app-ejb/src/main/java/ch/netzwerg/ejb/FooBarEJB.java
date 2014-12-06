package ch.netzwerg.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FooBarEJB {

    @Inject
    private FooEJB fooEJB;

    @Inject
    private BarEJB barEJB;

    public String getFooBar() {
        return fooEJB.getFoo() + " " + barEJB.getBar();
    }

}
