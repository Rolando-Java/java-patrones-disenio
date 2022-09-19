package org.bardales.java.patrones.patterndesign.estructural.adapter;

import java.util.Date;

public class MySystemReserve implements ReserveSL {

    @Override
    public String hotelInfo(String idHotel) {
        System.out.println("Search hotel info by idHotel...");
        return "Good hotel with four doors.";
    }

    @Override
    public long createReserve(String idHotel, String client, Date date, int days) {
        System.out.println("Create a reservation...");
        return 123;
    }

    @Override
    public String infoReserve(long code) {
        System.out.println("Search info reserve by code...");
        return "Good hotel with one bathroom and four rooms. Also has comfortable beds";
    }
}
