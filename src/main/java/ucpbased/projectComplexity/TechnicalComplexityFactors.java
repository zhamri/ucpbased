package ucpbased.projectComplexity;

/**
 * Class for Technical Complexity Factors (TCF)
 */
public class TechnicalComplexityFactors implements I_TechnicalComplexityFactors {

    private I_TechnicalComplexityFactors strategy;

    /**
     * To set strategy
     *
     * @param strategy
     */
    public void setStrategy(I_TechnicalComplexityFactors strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate TCF
     *
     * @return
     */
    @Override
    public double calculateTCF() {
        return this.strategy.calculateTCF();
    }
}