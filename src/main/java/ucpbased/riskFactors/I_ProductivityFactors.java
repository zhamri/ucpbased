package ucpbased.riskFactors;

/**
 * Interface for Productivity Factors
 */
public interface I_ProductivityFactors {

    /**
     * Abstract method to calculate MH
     *
     * @param ucp
     * @param pf
     * @return
     */
    public double calculateMH(double ucp, int pf);
}
