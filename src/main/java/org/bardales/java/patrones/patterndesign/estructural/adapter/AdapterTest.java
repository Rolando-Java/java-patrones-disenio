package org.bardales.java.patrones.patterndesign.estructural.adapter;

import java.util.Date;

public class AdapterTest {

    public static void main(String... args) {
        StandardReserveACMEAdapter reserveACMEAdapter = new StandardReserveACMEAdapter(
                new MySystemReserve());
        reserveACMEAdapter.createReservation(new Date(), 5, "1", "joe");
        reserveACMEAdapter.getReservation("123");
        reserveACMEAdapter.getInfoHotel("1a2b");
    }

}
