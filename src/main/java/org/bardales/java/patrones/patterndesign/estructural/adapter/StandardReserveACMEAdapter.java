package org.bardales.java.patrones.patterndesign.estructural.adapter;

import java.util.Date;

public class StandardReserveACMEAdapter implements StandardReserveACME {

    private ReserveSL reserveSL;

    public StandardReserveACMEAdapter(ReserveSL reserveSL) {
        this.reserveSL = reserveSL;
    }

    @Override
    public String getInfoHotel(String idHotel) {
        return this.reserveSL.hotelInfo(idHotel);
    }

    @Override
    public String createReservation(Date date, int days, String idHotel, String client) {
        long code = this.reserveSL.createReserve(idHotel, client, date, days);
        return String.valueOf(code);
    }

    @Override
    public String getReservation(String code) {
        return this.reserveSL.infoReserve(Long.parseLong(code));
    }
}
