package org.bardales.java.patrones.patterndesign.behaivor.interpreter;

import java.util.Map;

public class AdditionExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    public AdditionExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Double interpret(Map<String, Double> context) {
        return this.expr1.interpret(context) + this.expr2.interpret(context);
    }

}
