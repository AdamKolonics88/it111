package package_person_homework;

public class PersonDetails {

    /**
     * Calculates an adjustment to the monthly insurance premium based on the car’s model year.
     *
     * @param carYear The model year of the car.
     * @return A positive adjustment (higher premium) if the car is newer than 2018,
     *         or a negative adjustment (discount) if the car is 2018 or older.
     */
    public static double calculateCarAdjustment(int carYear) {
        if (carYear > 2018) {
            return 200.0;   // Newer car → more expensive insurance
        } else {
            return -50.0;   // Older car → discount
        }
    }

    public static void main(String[] args) {
        // ——— First person data ———
        String firstName = "Cathy Jones";
        int firstAge = 33;
        int firstCarYear = 2010;       // Car model year as int
        boolean firstViolations = false;
        double firstCreditScore = 690.0;

        // Calculate preliminary rate adjustment based on car year
        double firstPreliminaryRate = calculateCarAdjustment(firstCarYear);

        // (Optional) Additional adjustments can be added here based on age, gender, violations, credit score, etc.
        // For example:
        // if (firstAge < 25) {
        //     firstPreliminaryRate += 100.0;
        // }

        double firstFinalRate = firstPreliminaryRate;
        // If you want to include further logic, e.g. a gender‐based adjustment:
        // char firstGender = 'F';
        // double firstGenderAdjustment = (firstGender == 'M') ? 50.0 : 0.0;
        // firstFinalRate += firstGenderAdjustment;

        // Output all values for the first person
        System.out.println("Your name: " + firstName);
        System.out.println("Your age: " + firstAge);
        System.out.println("Your car: " + firstCarYear);
        System.out.println("Your violations: " + firstViolations);
        System.out.println("Your Credit Score: " + firstCreditScore);
        System.out.println(firstFinalRate + " dollars");

        System.out.println(); // Print an empty line between the two persons

        // ——— Second person data ———
        String secondName = "Kendall Black";
        int secondAge = 22;
        int secondCarYear = 2019;
        boolean secondViolations = true;
        double secondCreditScore = 570.0;

        // Calculate preliminary rate for the second person
        double secondPreliminaryRate = calculateCarAdjustment(secondCarYear);

        // (Optional) Additional logic for the second person
        // if (secondAge < 25 && secondGender == 'M') {
        //     secondPreliminaryRate += 100.0;
        // }

        double secondFinalRate = secondPreliminaryRate;

        // Output all values for the second person
        System.out.println("Your name: " + secondName);
        System.out.println("Your age: " + secondAge);
        System.out.println("Your car: " + secondCarYear);
        System.out.println("Your violations: " + secondViolations);
        System.out.println("Your Credit Score: " + secondCreditScore);
        System.out.println(secondFinalRate + " dollars");
    }
}
