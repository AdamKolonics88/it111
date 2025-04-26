public class LitersToGallonsConverter {
    public static void main(String[] args) {
        // 1 gallon = 3.785 liters
        double liters;
        double gallons;

        for (liters = 10; liters <= 100; liters += 10) {
            gallons = liters / 3.785;
            System.out.printf("%.2f liters is equal to %.2f gallons.%n", liters, gallons);
        }

        System.out.println("All done!");
    }
}
