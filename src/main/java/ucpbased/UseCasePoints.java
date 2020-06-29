package ucpbased;

/**
 * UseCasePoints is a class for calculating UCP
 */
public class UseCasePoints {

	/**
	 * To calculate UCP
	 *
	 * @param uucp
	 * @param tcf
	 * @param ecf
	 * @return
	 */
	public double calculateUCP(double uucp, double tcf, double ecf) {
		return uucp * tcf * ecf;
	}
}
