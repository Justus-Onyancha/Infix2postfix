package com.example.calc;



public class Main {
    private static final String DefInput = "2 2 5 4 * * +";

    public static void main(String[] args) {
        String infix = DefInput;
//
//        changed not equal to
        if (args != null && args.length > 0)
            infix = args[0];

        String postfix = PostfixCalculator.infix2postfix(infix);
        double result = PostfixCalculator.solve(postfix);
        System.out.println("Answer: " + result);
    }
}
