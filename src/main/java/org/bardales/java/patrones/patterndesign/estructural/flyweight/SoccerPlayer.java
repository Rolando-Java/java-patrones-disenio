package org.bardales.java.patrones.patterndesign.estructural.flyweight;

public class SoccerPlayer {

    private String name;
    private int number;
    private String teamName;
    private TShirt tShirt;

    public SoccerPlayer(String name, int number, String teamName) {
        this.name = name;
        this.number = number;
        this.teamName = teamName;
        this.tShirt = TShirtFactory.getTeam(teamName);
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " number : " + this.number + " teamName : " + this.teamName
                + " tShirt [" + this.tShirt + "]";
    }

}
