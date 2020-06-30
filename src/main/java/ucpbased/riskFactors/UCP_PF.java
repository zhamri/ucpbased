package ucpbased.riskFactors;

/**
 * UCP_PF is a class for calculating Productivity Factors (PF) for UCP
 *
 * @author Zhamri Che Ani
 */
public class UCP_PF implements I_ProductivityFactors {

    /**
     * To calculate MH
     *
     * @param ucp use case points
     * @param pf productivity factor
     * @return man hours
     */
    public double calculateMH(double ucp, int pf) {
        double mh = ucp * pf;
        return mh;
    }
}