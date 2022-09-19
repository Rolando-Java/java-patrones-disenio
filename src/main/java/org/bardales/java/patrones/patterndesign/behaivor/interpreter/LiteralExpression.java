package org.bardales.java.patrones.patterndesign.behaivor.interpreter;

import java.util.Map;

public class LiteralExpression implements Expression {

    private final double literal;

    public LiteralExpression(double literal) {
        this.literal = literal;
    }

    @Override
    public Double interpret(Map<String, Double> context) {
        return this.literal;
    }

}
