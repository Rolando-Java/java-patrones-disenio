package org.bardales.java.patrones.patterndesign.behaivor.interpreter;

import java.util.Map;

public interface Expression {

    Double interpret(Map<String, Double> context);

}
