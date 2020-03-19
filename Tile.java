public class Tile
{
	private String type;
	private int score;
	private Coordinate coord;
	
	// ***2048 Specific***
	private Boolean merged;
	
	// Constructor
	Tile(String type, int score, Coordinate coord)
	{
		this.type = type;
		this.score = score;
		this.coord = coord;
		this.merged = false;
	}
	
	// Getters and Setters
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public Coordinate getCoordinate()
	{
		return this.coord;
	}
	
	public void setCoordinate(Coordinate coord)
	{
		this.coord = coord;
	}
	
	// ***2048 Specific***
	public Boolean getMerged()
	{
		return this.merged;
	}
	
	// ***2048 Specific***
	public void setMerged(Boolean merged)
	{
		this.merged = merged;
	}
	
	// Methods
	public void draw()
	{
		System.out.print(this.type);
	}
}
