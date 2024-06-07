package Enum;

import java.util.function.Function;

public enum Operation {
    PLUS("+") {
        @Override
        double calculate(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        double calculate(double x, double y) {
            return x - y;
        }
    },
    MULTI("*") {
        @Override
        double calculate(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double calculate(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double calculate(double x, double y);
}
