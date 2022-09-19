package org.bardales.java.patrones.patterndesign.estructural.adapter;

import java.util.Date;

public interface StandardReserveACME {

    String getInfoHotel(String idHotel);

    String createReservation(Date date, int days, String idHotel, String client);

    String getReservation(String code);

}
