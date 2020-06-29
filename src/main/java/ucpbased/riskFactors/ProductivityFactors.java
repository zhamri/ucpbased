package ucpbased.riskFactors;

/**
 * A class for Productivity Factors (PF) calculation
 */
public class ProductivityFactors implements I_ProductivityFactors {

    private I_ProductivityFactors strategy;

    /**
     * To set Strategy
     *
     * @param strategy
     */
    public void setStrategy(I_ProductivityFactors strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate MH
     *
     * @param ucp
     * @param pf
     * @return
     */
    @Override
    public double calculateMH(double ucp, int pf) {
        return this.strategy.calculateMH(ucp, pf);
    }
}