package f1management;

public class Driver {
	private String name;
	private String nationality;
	private int age;
	private int points;
	
//	constructor
	Driver(String name, String nation,int age){
		
		this.name = name;
		this.age = age;
		this.nationality = nation;
		this.points = 0;
		
	}
	
	public void addPoints(int pts)
	{
		this.points+=pts;
	}
	public String getName()
	{
		return this.name;
	}
	
	public int getPoints() { return this.points; }

}
