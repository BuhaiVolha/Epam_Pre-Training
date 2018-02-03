public class RingAreaCalculator {

    public static void main(String[] args) {
        //calculate the area of a ring knowing two radiuses
        //first radius;
        double r1 = 11.2;
        //second radius;
        double r2 = 35.8;
        
        System.out.printf("The area of a ring equals: %.2f\n",
                RingAreaCalculatorLogic.getRingArea(r1,r2));
    }
}

class RingAreaCalculatorLogic {

    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getRingArea(double r1, double r2) {
        double s = getCircleArea(r1) - getCircleArea(r2);
        return Math.abs(s);
    }
}
