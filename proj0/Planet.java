public class Planet{
	public double xxPos = 0.0;
	public double yyPos = 0.0;
	public double xxVel = 0.0;
	public double yyVel = 0.0;
	public double mass = 0.0;
	public String imgFileName = "jupiter.gif";
	
	static final double G = 6.67e-11;
	
	
	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}
	
	public Planet(Planet p){
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}
	
	public double calcDistance(Planet p){
		double dx = p.xxPos - this.xxPos;
		double dy = p.yyPos - this.yyPos;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public double calcForceExertedBy(Planet p){
		double r = this.calcDistance(p);
		return (G * this.mass * p.mass / (r * r));
	}
	
	public double calcForceExertedByX(Planet p){
		double dx = p.xxPos - this.xxPos;
		double r = this.calcDistance(p);
		double f = this.calcForceExertedBy(p);
		return (f * dx / r);
	}
	
	public double calcForceExertedByY(Planet p){
		double dy = p.yyPos - this.yyPos;
		double r = this.calcDistance(p);
		double f = this.calcForceExertedBy(p);
		return (f * dy / r);
	}
}