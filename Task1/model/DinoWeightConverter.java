package by.epam_pre_training.task1;

public class DinoWeightConverter {
    private static final int GRAM_PER_KILOGRAM = 1000;
    private static final int GRAM_PER_TONNE = 1_000_000;

    public static double convertToKg(double gr) {
        return gr / GRAM_PER_KILOGRAM;
    }

    public static double convertToTones(double gr) {
        return gr / GRAM_PER_TONNE;
    }
}
