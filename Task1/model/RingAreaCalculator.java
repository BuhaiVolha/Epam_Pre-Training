package by.epam_pre_training.task1;

public class RingAreaCalculator {

    public static double getRingArea(double r1, double r2) {
        double s = getCircleArea(r1) - getCircleArea(r2);
        return Math.abs(s);
    }

    private static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
