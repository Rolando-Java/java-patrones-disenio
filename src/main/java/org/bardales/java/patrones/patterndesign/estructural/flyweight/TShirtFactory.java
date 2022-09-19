package org.bardales.java.patrones.patterndesign.estructural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TShirtFactory {

    private static final Map<String, TShirt> teamMap = new HashMap<>();

    public static TShirt getTeam(String teamName) {
        if (!teamMap.containsKey(teamName)) {
            teamMap.put(teamName, new TShirt(new byte[]{(byte) teamName.length()}));
        }
        return teamMap.get(teamName);
    }

}
