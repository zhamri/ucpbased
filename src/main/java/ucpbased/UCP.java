package ucpbased;

import ucpbased.projectComplexity.EnvironmentalComplexityFactors;
import ucpbased.projectComplexity.TechnicalComplexityFactors;
import ucpbased.projectComplexity.UCP_EFactor;
import ucpbased.projectComplexity.UCP_TFactor;
import ucpbased.projectSize.*;
import ucpbased.riskFactors.ProductivityFactors;
import ucpbased.riskFactors.UCP_PF;

/**
 * This {@code UCP} class represents a framework for calculating the Use Case Points.
 *
 * @author Zhamri Che Ani
 */
public final class UCP {

    private UnadjustedUseCaseWeight managerUseCaseWeight;
    private UnadjustedActorWeight managerActorWeight;
    private UnadjustedUseCasePoints uucp;
    private TechnicalComplexityFactors managerTCF;
    private EnvironmentalComplexityFactors managerECF;
    private UseCasePoints ucp;
    private ProductivityFactors managerPF;
    private double UUCW;
    private double UAW;
    private double UUCP;
    private double TCF;
    private double ECF;
    private double UCP;
    private double PF;

    /**
     * This constructor if for creating new objects.
     */
    public UCP() {
        managerUseCaseWeight = new UnadjustedUseCaseWeight();
        managerActorWeight = new UnadjustedActorWeight();
        uucp = new UnadjustedUseCasePoints();
        managerTCF = new TechnicalComplexityFactors();
        managerECF = new EnvironmentalComplexityFactors();
        ucp = new UseCasePoints();
        managerPF = new ProductivityFactors();
    }

    /**
     * This method is for calculating the use case complexity based on three inputs.
     * Use case complexity is classified into three categories: simple, average and complex.
     *
     * @param simple  A simple use case is referring to three or fewer number of transactions.
     * @param average An average use case is referring to four to seven number of transactions.
     * @param complex A complex use case is referring to more than seven number of transactions.
     */
    public void input_UUCW(int simple, int average, int complex) {
        managerUseCaseWeight.setStrategy(new UCP_UUCW(simple, average, complex));
        UUCW = managerUseCaseWeight.calculateUUCW();
    }

    /**
     * This method is for calculating the actor complexity based on three inputs.
     * Actor complexity is classified into three categories: simple, average and complex.
     *
     * @param simple  A simple actor is referring to another system that communicates via a pre-defined API.
     * @param average An average actor is referring to either human beings or another system interacting
     *                through a well-defined protocol such as TCP/IP.
     * @param complex A complex actor is referring to a person interacting through a GUI or a Web page.
     */
    public void input_UAW(int simple, int average, int complex) {
        managerActorWeight.setStrategy(new UCP_UAW(simple, average, complex));
        UAW = managerActorWeight.calculateUAW();
    }

    /**
     * This private method is for calculating the unadjusted use case points based on the actor
     * and use case complexity.
     *
     * @return UUCP (Unadjusted Use Case Points)
     */
    private double getUUCP() {
        UUCP = uucp.calculateUUCP(UAW, UUCW);
        return UUCP;
    }

    /**
     * This method is for calculating the technical complexity based on 13 factors.
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
    public void input_TCF(int t1_Assessment, int t2_Assessment, int t3_Assessment, int t4_Assessment, int t5_Assessment, int t6_Assessment, int t7_Assessment, int t8_Assessment, int t9_Assessment, int t10_Assessment, int t11_Assessment, int t12_Assessment, int t13_Assessment) {
        managerTCF.setStrategy(new UCP_TFactor(t1_Assessment, t2_Assessment, t3_Assessment, t4_Assessment, t5_Assessment, t6_Assessment, t7_Assessment, t8_Assessment, t9_Assessment, t10_Assessment, t11_Assessment, t12_Assessment, t13_Assessment));
        TCF = managerTCF.calculateTCF();
    }

    /**
     * This method is for calculating the environmental complexity based on eight factors.
     *
     * @param e1_Assessment Familiarity with the project.
     * @param e2_Assessment Application experience.
     * @param e3_Assessment Object-oriented programming experience.
     * @param e4_Assessment Lead analyst capability.
     * @param e5_Assessment Motivation.
     * @param e6_Assessment Stable requirements.
     * @param e7_Assessment Part-time staff.
     * @param e8_Assessment Difficult programming language.
     */
    public void input_ECF(int e1_Assessment, int e2_Assessment, int e3_Assessment, int e4_Assessment, int e5_Assessment, int e6_Assessment, int e7_Assessment, int e8_Assessment) {
        managerECF.setStrategy(new UCP_EFactor(e1_Assessment, e2_Assessment, e3_Assessment, e4_Assessment, e5_Assessment, e6_Assessment, e7_Assessment, e8_Assessment));
        ECF = managerECF.calculateECF();
    }

    /**
     * This private method is for calculating the use case points based on the unadjusted use case points,
     * technical complexity and environmental complexity.
     */
    private void calculateUCP() {
        UUCP = uucp.calculateUUCP(UAW, UUCW);
        UCP = ucp.calculateUCP(UUCP, TCF, ECF);
    }

    /**
     * This method is for getting the value of UCP (Use Case Points).
     *
     * @return UCP (Use Case Points)
     */
    public double getUCP() {
        calculateUCP();
        return UCP;
    }

    /**
     * This method is for getting the PF (Productivity Factor).
     *
     * @return PF (Productivity Factor)
     */
    public double getPF() {
        calculateUCP();
        managerPF.setStrategy(new UCP_PF());
        PF = managerPF.calculateMH(UCP, 28);
        return PF;
    }

}
