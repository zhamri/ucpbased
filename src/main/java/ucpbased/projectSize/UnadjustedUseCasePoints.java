package ucpbased.projectSize;

/**
 * UnadjustedUseCasePoints is a class for computing the Unadjusted Use Case Points (UUCP)
 */
public class UnadjustedUseCasePoints {

    /**
     * To calculate UUCP
     *
     * @param uucw
     * @param uaw
     * @return
     */
    public double calculateUUCP(double uucw, double uaw) {
        return uucw + uaw;
    }
}
