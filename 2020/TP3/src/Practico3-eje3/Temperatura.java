public class Temperatura
{
    private float rankine;
        
    public Temperatura()
    {
       rankine = 0;
    }

    public void setRankine(float rankine) {
        this.rankine = rankine;
    }
    public float getRankine() {
        return this.rankine;
    }
    
    public void setCelsius(float celsius) {
        rankine = celsius * 9/5 + 491.67f;
    }
    public float getCelsius() {
        return (rankine - 491.67f) * 5 / 9;
    }
    
}
