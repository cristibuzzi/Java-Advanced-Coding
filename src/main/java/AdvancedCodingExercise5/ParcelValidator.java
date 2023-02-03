package AdvancedCodingExercise5;

public class ParcelValidator implements Validator<Parcel> {

    private final static int MAX_SUM_OF_LENTHS = 300;
    private final static int MIN_SIZE_ALLOWED = 30;
    private final static double MAX_WEIGHT_FOR_REGULAR = 30;
    private final static double MAX_WEIGHT_FOR_EXPRESS = 15.0;

    @Override
    public boolean validate(Parcel input) {
        int sumOfLengths = input.getxLength() + input.getyLength() + input.getzLength();
        if (sumOfLengths > MAX_SUM_OF_LENTHS) {
            return false;
        }
        if (input.getzLength() < MIN_SIZE_ALLOWED) {
            return false;
        }
        if (input.getxLength() < MIN_SIZE_ALLOWED) {
            return false;
        }
        if (input.getyLength() < MIN_SIZE_ALLOWED) {
            return false;
        }
        if (input.isExpress()) {
            if (input.getWeight() > MAX_WEIGHT_FOR_EXPRESS) {
                return false;
            }
        } else {
            if (input.getWeight() > MAX_WEIGHT_FOR_REGULAR) {
                return false;
            }
        }
        return true;
    }
}

