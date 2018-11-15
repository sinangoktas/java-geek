package com.javacodegeeks.advanced.design;

public class DiamondOfDeath {
    interface A {
        default void performAction() {
        }
    }

    interface B extends A {
        @Override
        default void performAction() {
        }
    }

    interface C extends A {
        @Override
        default void performAction() {
        }
    }

    // E is not compilable unless it overrides perfromAction() as well
    interface E extends B, C {
        @Override
        default void performAction() {

        }
    }

    /*
    java does not support multiple inheritance through class.
    But through the interface, multiple inheritance is possible in java.
    No java doesn't support multiple inheritance directly because it leads to overriding of methods
    when both extended class have a same method nam
     */
}
