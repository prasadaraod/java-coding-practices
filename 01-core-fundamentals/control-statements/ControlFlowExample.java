public class ControlFlowExample {
    public static void main(String[] args) {
        // If-Else
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // Switch (Modern Switch Expression)
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println(day + " is a " + typeOfDay);

        // Loops
        System.out.println("For Loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("While Loop:");
        int j = 0;
        while (j < 3) {
            System.out.println("While Count: " + j);
            j++;
        }
    }
}
