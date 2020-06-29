package ucpbased.projectSize;

/**
 * Class for Unadjusted Actor Weight (UAW) calculation
 */
public class UnadjustedActorWeight implements I_ActorWeight {

    private I_ActorWeight strategy;

    /**
     * To set strategy
     *
     * @param strategy
     */
    public void setStrategy(I_ActorWeight strategy) {
        this.strategy = strategy;
    }

    /**
     * To calculate UAW
     *
     * @return
     */
    @Override
    public double calculateUAW() {
        return this.strategy.calculateUAW();
    }
}