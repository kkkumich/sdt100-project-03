package part2_activity;

import common.Input;
public class Main {
    public static String activity(int age) {
        if(age<0) throw new IllegalArgumentException("Age cannot be negative");
        // The assignment leaves ages 6 and 23 unspecified. Ask rather than invent a category.
        if(age==6 || age==23) return "Boundary age: please clarify your current activity.";
        if(age<6) return "Home, walks and kindergarten";
        if(age<=17) return "School";
        if(age<=22) return "University";
        if(age<=60) return "Work";
        return "Retired";
    }
    public static void main(String[] args) {
        String name=Input.text("Your name: ");
        int age=Input.integer("Your age (0-120): ",0,120);
        System.out.println(name + ", your likely activity: " + activity(age));
    }
}
