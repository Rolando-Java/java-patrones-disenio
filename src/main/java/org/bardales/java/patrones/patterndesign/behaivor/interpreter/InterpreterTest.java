package org.bardales.java.patrones.patterndesign.behaivor.interpreter;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest {

    public static void main(String... args) {
        Expression finalGrade = new AdditionExpression(
                new AdditionExpression(
                        new ProductExpression(
                                new VariableExpression("practica"),
                                new LiteralExpression(0.2)
                        ),
                        new ProductExpression(
                                new VariableExpression("conducta"),
                                new LiteralExpression(0.1)
                        )
                ),
                new ProductExpression(
                        new VariableExpression("examen"),
                        new LiteralExpression(0.7)
                )
        );

        Map<String, Double> grades = new HashMap<>();
        grades.put("practica", 7.0);
        grades.put("conducta", 6.0);
        grades.put("examen", 8.7);

        System.out.println("The final grade is " + finalGrade.interpret(grades));
    }

}
