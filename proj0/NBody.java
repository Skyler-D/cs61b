/**
 * NBody
 * @author Skyler
 * @source cs61b
 */
public class NBody{
	public static double readRadius(String fileName){
		In in = new In(fileName);
		in.readInt(); // 读取并丢弃 5
		double R = in.readDouble();
		return R;
	}
}