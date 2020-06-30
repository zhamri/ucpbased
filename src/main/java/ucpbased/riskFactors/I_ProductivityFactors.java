package ucpbased.riskFactors;

/**
 * Interface for Productivity Factors
 */
public interface I_ProductivityFactors {

    /**
     * Abstract method to calculate MH
     *
     * @param ucp use case points
     * @param pf productivity factor
     * @return man hours
     */
    public double calculateMH(double ucp, int pf);
}
