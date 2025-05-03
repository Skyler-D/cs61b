/**
 *  This test is expected to create 2 planets,
 *  and prints out the pairwise force between them.
 *  @author Skyler
 */
public class TestPlanet{
	public static void main(String[] args){
		Planet a = new Planet(0.0, 1.0, 2.0, 3.0, 44.0, "a.gif");
		Planet b = new Planet(3.3, 4.0, 5.0, 6.4, 77.0, "b.gif");
		
		//System.out.println("Distance between a and b: " + a.calcDistance(b));
		//System.out.println("Force a -> b: " + a.calcForceExertedBy(b));
		//System.out.println("Force b -> a: " + b.calcForceExertedBy(a));
		
		System.out.println("the pairwise force are " + a.calcForceExertedBy(b) + " " + b.calcForceExertedBy(a));
	}
}