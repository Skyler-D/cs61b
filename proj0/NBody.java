/**
 * NBody
 * @author Skyler
 * @source cs61b
 */
public class NBody{
	public static double readRadius(String fileName){
		In in = new In(fileName);
		int N = in.readInt();
		double R = in.readDouble();
		return R;
	}
}