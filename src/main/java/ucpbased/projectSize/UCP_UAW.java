package ucpbased.projectSize;

/**
 * UCP_UAW is a class for calculating Unadjusted Actor Weight (UAW).
 */
public class UCP_UAW implements I_ActorWeight {

    private final int A1_Weight = 1;
    private final int A2_Weight = 2;
    private final int A3_Weight = 3;

    private int A1_Assessment = 0;
    private int A2_Assessment = 0;
    private int A3_Assessment = 0;

    private double Total_A1 = 0;
    private double Total_A2 = 0;
    private double Total_A3 = 0;

    /**
     * Constructor of UCP_UAW
     *
     * @param a1_Assessment simple
     * @param a2_Assessment average
     * @param a3_Assessment complex
     */
    public UCP_UAW(int a1_Assessment, int a2_Assessment, int a3_Assessment) {
        this.A1_Assessment = a1_Assessment;
        this.A2_Assessment = a2_Assessment;
        this.A3_Assessment = a3_Assessment;
    }

    /**
     * To calculate UAW
     *
     * @return unadjusted actor weight
     */
    public double calculateUAW() {
        Total_A1 = A1_Weight * A1_Assessment;
        Total_A2 = A2_Weight * A2_Assessment;
        Total_A3 = A3_Weight * A3_Assessment;
        double auw = Total_A1 + Total_A2 + Total_A3;
        return auw;
    }
}
