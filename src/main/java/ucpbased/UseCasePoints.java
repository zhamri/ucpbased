package ucpbased;

/**
 * {@code UseCasePoints} is a class for calculating Use Case Points (UCP)
 *
 * @author Zhamri Che Ani
 */
public class UseCasePoints {

	/**
	 * This method is for calculating the UCP
	 *
	 * @param uucp Unadjusted Use Case Points
	 * @param tcf Technical Complexity Factors
	 * @param ecf Environmental Complexity Factors
	 * @return UCP (Use Case Points)
	 */
	public double calculateUCP(double uucp, double tcf, double ecf) {
		return uucp * tcf * ecf;
	}
}
