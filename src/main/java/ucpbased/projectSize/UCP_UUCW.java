package ucpbased.projectSize;

/**
 * UCP_UUCW is a class for calculating Unadjusted Use Case Weight (UUCW).
 */
public class UCP_UUCW implements I_UseCaseWeight {

    private final int U1_Weight = 5;
    private final int U2_Weight = 10;
    private final int U3_Weight = 15;

    private int U1_Assessment = 0;
    private int U2_Assessment = 0;
    private int U3_Assessment = 0;

    private double Total_U1 = 0;
    private double Total_U2 = 0;
    private double Total_U3 = 0;

    /**
     * Constructor of UCP_UUCW
     *
     * @param u1_Assessment simple
     * @param u2_Assessment average
     * @param u3_Assessment complex
     */
    public UCP_UUCW(int u1_Assessment, int u2_Assessment, int u3_Assessment) {
        this.U1_Assessment = u1_Assessment;
        this.U2_Assessment = u2_Assessment;
        this.U3_Assessment = u3_Assessment;
    }

    /**
     * To calculate UUCW
     *
     * @return unadjusted use case weight
     */
    public double calculateUUCW() {
        Total_U1 = U1_Weight * U1_Assessment;
        Total_U2 = U2_Weight * U2_Assessment;
        Total_U3 = U3_Weight * U3_Assessment;
        double uucw = Total_U1 + Total_U2 + Total_U3;
        return uucw;
    }

}