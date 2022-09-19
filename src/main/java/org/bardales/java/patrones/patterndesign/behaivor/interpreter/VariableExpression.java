package org.bardales.java.patrones.patterndesign.behaivor.interpreter;

import java.util.Map;
import java.util.Objects;

public class VariableExpression implements Expression {

    private final String variable;

    public VariableExpression(String variable) {
       this.variable = variable;
    }

    @Override
    public Double interpret(Map<String, Double> context) {
        Double value = context.get(variable);
        if(Objects.isNull(value)) {
           return 0D;
        }
        return value;
    }

}
