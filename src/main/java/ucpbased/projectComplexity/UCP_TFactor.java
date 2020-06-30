package ucpbased.projectComplexity;

/**
 * UCP_TFactor is a class for calculating Technical Complexity Factors (TCF).
 */
public class UCP_TFactor implements I_TechnicalComplexityFactors {

    private final double T1_Weight = 2;
    private final double T2_Weight = 1;
    private final double T3_Weight = 1;
    private final double T4_Weight = 2;
    private final double T5_Weight = 1;
    private final double T6_Weight = 0.5;
    private final double T7_Weight = 0.5;
    private final double T8_Weight = 2;
    private final double T9_Weight = 1;
    private final double T10_Weight = 1;
    private final double T11_Weight = 1;
    private final double T12_Weight = 1;
    private final double T13_Weight = 1;

    private int T1_Assessment = 0;
    private int T2_Assessment = 0;
    private int T3_Assessment = 0;
    private int T4_Assessment = 0;
    private int T5_Assessment = 0;
    private int T6_Assessment = 0;
    private int T7_Assessment = 0;
    private int T8_Assessment = 0;
    private int T9_Assessment = 0;
    private int T10_Assessment = 0;
    private int T11_Assessment = 0;
    private int T12_Assessment = 0;
    private int T13_Assessment = 0;

    private double T1 = 0;
    private double T2 = 0;
    private double T3 = 0;
    private double T4 = 0;
    private double T5 = 0;
    private double T6 = 0;
    private double T7 = 0;
    private double T8 = 0;
    private double T9 = 0;
    private double T10 = 0;
    private double T11 = 0;
    private double T12 = 0;
    private double T13 = 0;

    /**
     * Constructor of UCP_TFactor
     *
     * @param t1_Assessment  Distributed system required.
     * @param t2_Assessment  Response time is important.
     * @param t3_Assessment  End-user efficiency.
     * @param t4_Assessment  Complex internal processing required.
     * @param t5_Assessment  Reusable code must be a focus.
     * @param t6_Assessment  Easy to install.
     * @param t7_Assessment  Easy to use.
     * @param t8_Assessment  Cross-platform support.
     * @param t9_Assessment  Easy to change.
     * @param t10_Assessment Highly concurrent.
     * @param t11_Assessment Custom security.
     * @param t12_Assessment Dependence on third-party code.
     * @param t13_Assessment User training.
     */
    public UCP_TFactor(int t1_Assessment, int t2_Assessment, int t3_Assessment, int t4_Assessment, int t5_Assessment,
                       int t6_Assessment, int t7_Assessment, int t8_Assessment, int t9_Assessment, int t10_Assessment,
                       int t11_Assessment, int t12_Assessment, int t13_Assessment) {
        this.T1_Assessment = t1_Assessment;
        this.T2_Assessment = t2_Assessment;
        this.T3_Assessment = t3_Assessment;
        this.T4_Assessment = t4_Assessment;
        this.T5_Assessment = t5_Assessment;
        this.T6_Assessment = t6_Assessment;
        this.T7_Assessment = t7_Assessment;
        this.T8_Assessment = t8_Assessment;
        this.T9_Assessment = t9_Assessment;
        this.T10_Assessment = t10_Assessment;
        this.T11_Assessment = t11_Assessment;
        this.T12_Assessment = t12_Assessment;
        this.T13_Assessment = t13_Assessment;
    }

    /**
     * To calculate TFactor
     *
     * @return tFactor
     */
    private double calculateTFactor() {
        T1 = T1_Weight * T1_Assessment;
        T2 = T2_Weight * T2_Assessment;
        T3 = T3_Weight * T3_Assessment;
        T4 = T4_Weight * T4_Assessment;
        T5 = T5_Weight * T5_Assessment;
        T6 = T6_Weight * T6_Assessment;
        T7 = T7_Weight * T7_Assessment;
        T8 = T8_Weight * T8_Assessment;
        T9 = T9_Weight * T9_Assessment;
        T10 = T10_Weight * T10_Assessment;
        T11 = T11_Weight * T11_Assessment;
        T12 = T12_Weight * T12_Assessment;
        T13 = T13_Weight * T13_Assessment;
        double tFactor = T1 + T2 + T3 + T4 + T5 + T6 + T7 + T8 + T9 + T10 + T11 + T12 + T13;
        return tFactor;
    }

    /**
     * To calculate TCF
     *
     * @return technical complexity factors
     */
    public double calculateTCF() {
        double TFactor = calculateTFactor();
        double tcf = 0.6 + (0.01 * TFactor);
        return tcf;
    }
}