/*
Land Mass Calculations
One acre of land is equivalent to 43,560 square feet.

Write a program that calculates the number of acres (as a whole number) that exist within a tract
of land that is 391,876 square feet. Then figure out how much more land you'll need in order to
make up another acre.

HINTs: You'll need to use the modulus operator for at least one of your calculations.
You can also take advantage of how Integer Division / 'int' data type works to have the
rounding you need for "number of acres" occur implicitly.
 */


public class Lab4 {

    public static void main(String[] args){

        int feetInAcre = 43560 ;
        int thisLand = 391876;
        int landRounded = thisLand / feetInAcre;


        System.out.println("A Land that has 391,876 sq ft. is equivalent to " + landRounded
                            + " acres.");

        int landNotRounded = - (feetInAcre * landRounded - thisLand) ;


        System.out.println("It would take "  + landNotRounded + " sq ft. to make another acre.");

    }
}
