package ex5;

/**
 * Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
 * Create a Parcel class with the parameters:
 * • int xLength • int yLength • int zLength • float weight • boolean isExpress
 * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
 * whether each size is not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 * In case of errors, it should inform the user about them.
 */
public class Main {
    public static void main(String[] args) {

        Parcel parcelExpresOk = new Parcel(33,35,55,14,true);
        Parcel parcelExpresNotOk = new Parcel(33,35,55,18,true);
        Parcel parcelNotExpresOk = new Parcel(33,35,55,28,false);
        Parcel parcelNotExpresNotOk = new Parcel(33,35,55,36,false);
        Parcel parcelSumOfLengthsNotOk = new Parcel(200,200,100,16,false);
        Parcel parcelLengthNotOk = new Parcel(23,55,55,16,true);

        Validator<Parcel> validator = new ParcelValidator();
        System.out.println(validator.validate(parcelExpresOk));
        System.out.println(validator.validate(parcelExpresNotOk));
        System.out.println(validator.validate(parcelNotExpresOk));
        System.out.println(validator.validate(parcelNotExpresNotOk));
        System.out.println(validator.validate(parcelSumOfLengthsNotOk));
        System.out.println(validator.validate(parcelLengthNotOk));
    }
}
