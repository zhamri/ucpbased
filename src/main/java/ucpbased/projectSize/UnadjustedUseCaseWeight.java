package ucpbased.projectSize;

/**
 * Class for Unadjusted Use Case Weight (UUCW) calculation
 */
public class UnadjustedUseCaseWeight implements I_UseCaseWeight {

    private I_UseCaseWeight strategy;

    /**
     * To set Strategy
     *
     * @param strategy
     */
    public void setStrategy(I_UseCaseWeight strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate UUCW
     *
     * @return
     */
    @Override
    public double calculateUUCW() {
        return this.strategy.calculateUUCW();
    }
}