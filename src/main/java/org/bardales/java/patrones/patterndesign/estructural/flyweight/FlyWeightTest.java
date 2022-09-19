package org.bardales.java.patrones.patterndesign.estructural.flyweight;

public class FlyWeightTest {

    public static void main(String... args) {
        SoccerPlayer soccer1 = new SoccerPlayer("julian", 7, "crystal");
        SoccerPlayer soccer2 = new SoccerPlayer("gustavo", 10, "crystal");
        SoccerPlayer soccer3 = new SoccerPlayer("enrique", 9, "barza");
        System.out.println("soccer1 = " + soccer1);
        System.out.println("soccer2 = " + soccer2);
        System.out.println("soccer3 = " + soccer3);
    }

}
