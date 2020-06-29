package ucpbased.projectComplexity;

/**
 * UCP_EFactor is a class for calculating Environmental Complexity Factors (ECF).
 */
public class UCP_EFactor implements I_EnvironmentalComplexityFactors {

    private final double E1_Weight = 1.5;
    private final double E2_Weight = 0.5;
    private final double E3_Weight = 1;
    private final double E4_Weight = 0.5;
    private final double E5_Weight = 1;
    private final double E6_Weight = 2;
    private final double E7_Weight = -1;
    private final double E8_Weight = -1;

    private int E1_Assessment = 0;
    private int E2_Assessment = 0;
    private int E3_Assessment = 0;
    private int E4_Assessment = 0;
    private int E5_Assessment = 0;
    private int E6_Assessment = 0;
    private int E7_Assessment = 0;
    private int E8_Assessment = 0;

    private double E1 = 0;
    private double E2 = 0;
    private double E3 = 0;
    private double E4 = 0;
    private double E5 = 0;
    private double E6 = 0;
    private double E7 = 0;
    private double E8 = 0;

    /**
     * Constructor of UCP_EFactor
     *
     * @param e1_Assessment
     * @param e2_Assessment
     * @param e3_Assessment
     * @param e4_Assessment
     * @param e5_Assessment
     * @param e6_Assessment
     * @param e7_Assessment
     * @param e8_Assessment
     */
    public UCP_EFactor(int e1_Assessment, int e2_Assessment, int e3_Assessment, int e4_Assessment, int e5_Assessment,
                       int e6_Assessment, int e7_Assessment, int e8_Assessment) {
        this.E1_Assessment = e1_Assessment;
        this.E2_Assessment = e2_Assessment;
        this.E3_Assessment = e3_Assessment;
        this.E4_Assessment = e4_Assessment;
        this.E5_Assessment = e5_Assessment;
        this.E6_Assessment = e6_Assessment;
        this.E7_Assessment = e7_Assessment;
        this.E8_Assessment = e8_Assessment;
    }

    /**
     * To calculate EFactor
     *
     * @return efactor
     */
    private double calculateEFactor() {
        E1 = E1_Weight * E1_Assessment;
        E2 = E2_Weight * E2_Assessment;
        E3 = E3_Weight * E3_Assessment;
        E4 = E4_Weight * E4_Assessment;
        E5 = E5_Weight * E5_Assessment;
        E6 = E6_Weight * E6_Assessment;
        E7 = E7_Weight * E7_Assessment;
        E8 = E8_Weight * E8_Assessment;
        double eFactor = E1 + E2 + E3 + E4 + E5 + E6 + E7 + E8;
        return eFactor;
    }

    /**
     * To calculate ECF
     *
     * @return
     */
    public double calculateECF() {
        double EFactor = calculateEFactor();
        double ecf = 1.4 + (-0.03 * EFactor);
        return ecf;
    }
}
