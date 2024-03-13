public class Player
{
    private String name;
    private int score;

    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void updateScore(int addToScore){
        score+=addToScore;
    }
    
    public String toString(){
        return name + " " + score;
    }
}
