package ucpbased.riskFactors;

/**
 * UCP_PF is a class for calculating Productivity Factors (PF) for UCP
 */
public class UCP_PF implements I_ProductivityFactors {

    /**
     * To calculate MH
     *
     * @param ucp
     * @param pf
     * @return mh
     */
    public double calculateMH(double ucp, int pf) {
        double mh = ucp * pf;
        return mh;
    }
}