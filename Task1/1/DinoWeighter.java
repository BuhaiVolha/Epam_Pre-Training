public class DinoWeighter {

    public static void main(String[] args) {
        //input Dino's weight in grams
        int dinoWeight = 1_458_000;

        System.out.printf("Your Dino weights %.2f in kilogram", DinoWeighterLogic.convertToKg(dinoWeight));
        System.out.printf(", or %.2f in tones.", DinoWeighterLogic.convertToTones(dinoWeight));
    }
}

class DinoWeighterLogic {

    private static final int GRAM_PER_KILOGRAM = 1000;
    private static final int GRAM_PER_TONNE = 1_000_000;

    public static double convertToKg(double gr) {
        return gr / GRAM_PER_KILOGRAM;
    }

    public static double convertToTones(double gr) {
        return gr / GRAM_PER_TONNE;
    }
}
