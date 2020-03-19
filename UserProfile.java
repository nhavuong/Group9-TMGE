public class UserProfile
{
	private String username;
	private int score;
	private int turn;
	private Boolean alive;
	private Grid grid;
   
	// Constructor
    UserProfile(String name, Grid grid)
    {
        this.username = name;
        this.score = 0;
        this.turn = 1;
        this.alive = true;
        this.grid = grid;
    }
    
    // Getters and Setters
    public String getUsername()
    {
    	return username;
    }
    
    public void updateScore(int score)
    {
        this.score += score;
    }
    
    public int getScore()
    {
        return this.score; 
    }
    
    public void incrementTurn()
    {
        this.turn += 1;
    }
    
    public int getTurn()
    {
        return this.turn; 
    }

    public Boolean getAlive()
    {
    	return this.alive;
    }
    
    public void setAlive(Boolean alive)
    {
    	this.alive = alive;
    }
    
    public Grid getGrid()
    {
    	return this.grid;
    }
}
