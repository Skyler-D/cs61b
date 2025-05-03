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
	
	public static Planet[] readPlanets(String fileName){
		In in = new In(fileName);
		in.readInt();
		in.readDouble();		
		Planet[] planets = new Planet[5];
		for(int i = 0; i < 5; i++){
			planets[i] = new Planet(
				in.readDouble(), 
				in.readDouble(), 
				in.readDouble(), 
				in.readDouble(), 
				in.readDouble(), 
				in.readString()
			);
		}
		return planets;
	}
}