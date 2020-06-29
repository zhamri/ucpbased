package ucpbased.projectComplexity;

/**
 * Class for Environmental Complexity Factors (ECF)
 */
public class EnvironmentalComplexityFactors implements I_EnvironmentalComplexityFactors {

    private I_EnvironmentalComplexityFactors strategy;

    /**
     * To set strategy
     *
     * @param strategy
     */
    public void setStrategy(I_EnvironmentalComplexityFactors strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate ECF
     *
     * @return
     */
    @Override
    public double calculateECF() {
        return this.strategy.calculateECF();
    }
}