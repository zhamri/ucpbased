package ucpbased.riskFactors;

/**
 * A class for Productivity Factors (PF) calculation
 *
 * @author Zhamri Che Ani
 */
public class ProductivityFactors implements I_ProductivityFactors {

    private I_ProductivityFactors strategy;

    /**
     * To set Strategy for productivity factors
     *
     * @param strategy strategy of productivity factors
     */
    public void setStrategy(I_ProductivityFactors strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate MH
     *
     * @param ucp use case points
     * @param pf productivity factor
     * @return man hours
     */
    @Override
    public double calculateMH(double ucp, int pf) {
        return this.strategy.calculateMH(ucp, pf);
    }
}