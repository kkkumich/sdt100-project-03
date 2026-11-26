package class3_flowcharts;

import common.Input;

/** Class 3: the exact decisions shown on slides 11 and 12 of Lecture 3. */
public class Main {
    public static boolean walk(boolean isRaining) {
        // The lecture's first diagram literally routes isRaining=true to "Yes!".
        return isRaining;
    }

    public static boolean picnic(boolean isSaturday, boolean isRaining, boolean isBritain) {
        return isSaturday && (isBritain || !isRaining);
    }

    private static boolean askBoolean(String question) {
        while (true) {
            String answer = Input.text(question + " (true/false): ");
            if (answer.equalsIgnoreCase("true")) return true;
            if (answer.equalsIgnoreCase("false")) return false;
            System.out.println("Please enter true or false.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
        boolean isSaturday = askBoolean("Is it Saturday?");
        boolean isRaining = askBoolean("Is it raining?");
        boolean isBritain = askBoolean("Are you in Britain?");
        System.out.println("Walk, according to the lecture diagram: "
                + (walk(isRaining) ? "Yes!" : "Not Today!"));
        System.out.println("Picnic: " + picnic(isSaturday, isRaining, isBritain));
        System.out.println("Truth table: Saturday Raining Britain -> Picnic");
        for (boolean saturday : new boolean[]{false, true}) {
            for (boolean raining : new boolean[]{false, true}) {
                for (boolean britain : new boolean[]{false, true}) {
                    System.out.printf("%s %s %s -> %s%n", saturday, raining, britain,
                            picnic(saturday, raining, britain));
                }
            }
        }
    }
}
