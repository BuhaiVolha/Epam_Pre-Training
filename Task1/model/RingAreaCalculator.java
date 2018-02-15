package by.epam_pre_training.task1;

public class RingAreaCalculator {

    public static double calculateRingArea(double r1, double r2) {
        double s = calculateCircleArea(r1) - calculateCircleArea(r2);
        return Math.abs(s);
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
