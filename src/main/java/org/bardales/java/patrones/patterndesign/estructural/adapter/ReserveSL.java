package org.bardales.java.patrones.patterndesign.estructural.adapter;

import java.util.Date;

public interface ReserveSL {

    String hotelInfo(String idHotel);

    long createReserve(String idHotel, String client, Date date, int days);

    String infoReserve(long code);

}
