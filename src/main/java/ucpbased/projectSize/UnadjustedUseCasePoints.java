package ucpbased.projectSize;

/**
 * UnadjustedUseCasePoints is a class for computing the Unadjusted Use Case Points (UUCP)
 */
public class UnadjustedUseCasePoints {

    /**
     * To calculate UUCP
     *
     * @param uucw unadjusted use case weight
     * @param uaw unadjusted actor weight
     * @return unadjusted use case points
     */
    public double calculateUUCP(double uucw, double uaw) {
        return uucw + uaw;
    }
}
