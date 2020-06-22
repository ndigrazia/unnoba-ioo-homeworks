public class Temperatura2 extends Temperatura
{
    public Temperatura2()
    {
    }

    public void setKelvin(float kelvin) {
        setFahrenheit((kelvin - 273.15f) * 18 + 32);
    }
    public float getKelvin() {
        return (getFahrenheit() - 32) / 1.8f + 273.15f;
    }
    
    
    public void setFahrenheit(float fahrenheit) {
        setCelsius((fahrenheit-32)/1.8f);
    }
    public float getFahrenheit() {
        return getCelsius() * 1.8f + 32;
    }
    
}
